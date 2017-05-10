package au.com.swipejobs.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import au.com.swipejobs.domain.Job;
import au.com.swipejobs.domain.Worker;
import au.com.swipejobs.util.GeoUtil;

/**
 * Created by rodealmeida on 10/05/17.
 */
@ApplicationScoped
public class MatcherServiceImpl implements MatcherService
{
    @Inject
    private WorkersClient workersClient;
    @Inject
    private JobsClient jobsClient;

    @Override
    public List<Job> findTopJobsForWorker(String workerGuid)
    {
        Worker worker = getWorker(workerGuid);
        return getTopJobsForWorker(worker);
    }

    private List<Job> getTopJobsForWorker(Worker worker) {
        int jobCounter = 0;
        List<Job> jobs = jobsClient.getJobs();
        List<Job> topJobs = new ArrayList<>();

        for (Job job : jobs) {
            if (isDriverLicenseSatisfied(worker, job) && isDistanceAcceptable(worker, job) &&
                    areCertificatesRequirementsMet(worker, job)) {
                jobCounter++;
                topJobs.add(job);
            }
            if (jobCounter == 3) {
                return topJobs;
            }
        }

        return topJobs;
    }

    private boolean areCertificatesRequirementsMet(Worker worker, Job job) {
        for (String jobCertificate : job.getRequiredCertificates()) {
            if (!worker.getCertificates().stream().anyMatch(c -> c.equals(jobCertificate))) {
                return false;
            }
        }
        return true;
    }

    private boolean isDistanceAcceptable(Worker worker, Job job) {
        Double workerLat = new Double(worker.getJobSearchAddress().getLatitude());
        Double workerLon = new Double(worker.getJobSearchAddress().getLongitude());
        Double jobLat = new Double(job.getLocation().getLatitude());
        Double jobLon = new Double(job.getLocation().getLongitude());

        double distance = GeoUtil.calculateDistanceBetweenCoordinates(workerLat, jobLat, workerLon, jobLon);

        return distance <= worker.getJobSearchAddress().getMaxJobDistance();
    }

    private boolean isDriverLicenseSatisfied(Worker worker, Job job) {
        if (job.getDriverLicenseRequired()) {
            return worker.getHasDriversLicense();
        }
        return true;
    }

    private Worker getWorker(String workerGuid)
    {
        List<Worker> workers = workersClient.getWorkers();
        return workers.stream().filter(w -> w.getGuid().equals(workerGuid)).findFirst().get();
    }
}
