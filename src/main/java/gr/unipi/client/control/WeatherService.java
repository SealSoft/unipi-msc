package gr.unipi.client.control;

import gr.unipi.client.boundary.OpenweatherClient;
import gr.unipi.client.entity.ExportValue;
import gr.unipi.client.entity.WeatherResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class WeatherService {

  @Inject
  @RestClient
  OpenweatherClient client;

  public ExportValue getSpotWeatherData(String name) {
    ExportValue exportValue = new ExportValue();
    exportValue.setTextValue(client.retrieveWeatherData(name, "ebfa760cd2b6f803a277bb06d9a1fb22", "metric").readEntity(WeatherResponse.class));
    return exportValue;
  }
}
