package au.com.swipejobs.service;

import java.util.List;

import au.com.swipejobs.domain.Job;

/**
 * Created by rodealmeida on 10/05/17.
 */
public interface MatcherService
{
    List<Job> findTopJobsForWorker(String workerGuid);
}
