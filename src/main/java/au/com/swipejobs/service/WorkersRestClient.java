package au.com.swipejobs.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import au.com.swipejobs.config.Property;
import au.com.swipejobs.domain.Worker;

/**
 * Created by rodealmeida on 10/05/2017.
 */
@ApplicationScoped
public class WorkersRestClient implements WorkersClient
{

    @Inject
    @Property("swipejobs.workers.api")
    private String apiEndpoint;

    private Client client;

    private WebTarget target;

    @PostConstruct
    protected void init()
    {
        client = ClientBuilder.newClient();
        target = client.target(apiEndpoint)
                .queryParam("format", "json");
    }

    public List<Worker> getWorkers()
    {
        return target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Worker>>(){});
    }

}
