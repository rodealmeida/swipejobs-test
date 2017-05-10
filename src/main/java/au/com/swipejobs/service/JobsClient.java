package au.com.swipejobs.service;

import java.util.List;

import au.com.swipejobs.domain.Job;

/**
 * Created by rodealmeida on 10/05/2017.
 */
public interface JobsClient
{
    /**
     * Find Jobs.
     *
     * @return the found jobs.
     */
    List<Job> getJobs();

}
