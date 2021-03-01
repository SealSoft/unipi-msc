package gr.unipi.client.boundary;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("weather")
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
public interface OpenweatherClient extends AutoCloseable {

  @GET
  @Path("")
  Response retrieveWeatherData(@QueryParam("q") String searchName,
                               @QueryParam("APPID") String appId,
                               @QueryParam("units") String units);
}
