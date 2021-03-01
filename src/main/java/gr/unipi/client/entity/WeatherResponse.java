package gr.unipi.client.entity;

import java.util.List;

public class WeatherResponse {
  private List<WeatherDescriptiveResponse> weather;
  private MainDataResponse main;
  private WindData wind;

  public List<WeatherDescriptiveResponse> getWeather() {
    return weather;
  }

  public void setWeather(List<WeatherDescriptiveResponse> weather) {
    this.weather = weather;
  }

  public MainDataResponse getMain() {
    return main;
  }

  public void setMain(MainDataResponse main) {
    this.main = main;
  }

  public WindData getWind() {
    return wind;
  }

  public void setWind(WindData wind) {
    this.wind = wind;
  }
}
