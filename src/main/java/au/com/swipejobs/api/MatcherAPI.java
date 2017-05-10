package au.com.swipejobs.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import au.com.swipejobs.domain.Job;
import au.com.swipejobs.service.MatcherService;

/**
 * Created by rodealmeida on 10/05/2017.
 */
@Path("/")
@Consumes({ "application/json" })
@Produces("application/json")
public class MatcherAPI
{

    @Inject
    private MatcherService matcherService;

    @GET
    @Path("/worker/jobs")
    public List<Job> getTopJobsForWorker(@QueryParam("workerId") String workerId)
    {
        return matcherService.findTopJobsForWorker(workerId);
    }

}
