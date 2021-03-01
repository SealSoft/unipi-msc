package gr.unipi.client.boundary;

import gr.unipi.client.control.WeatherService;
import gr.unipi.client.entity.ExportValue;
import gr.unipi.client.entity.InputValue;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("run")
public class WeatherResource {

  @Inject
  WeatherService service;

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public ExportValue retrieveWeatherData(InputValue inputValue) {
    System.out.println(inputValue.getValue().getText());
    System.out.println(inputValue.getValue().getTrigger_word());
    return service.getSpotWeatherData(inputValue.getValue().getText().split(" ")[1]);
  }
}