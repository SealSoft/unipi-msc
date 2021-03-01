package gr.unipi.client.entity;

public class ExportValue {
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setTextValue(WeatherResponse weatherResponse) {
    this.text = weatherResponse.getWeather().get(0).getDescription().concat(", ")
            .concat(" ").concat("Temperature: ").concat(String.valueOf(weatherResponse.getMain().getTemp()))
            .concat(" ").concat("Real feel: ").concat(String.valueOf(weatherResponse.getMain().getFeels_like()))
            .concat(" ").concat("Max Temperature: ").concat(String.valueOf(weatherResponse.getMain().getTemp_max()))
            .concat(" ").concat("Min Temperature: ").concat(String.valueOf(weatherResponse.getMain().getTemp_max()))
            .concat(" ").concat("Humidity: ").concat(String.valueOf(weatherResponse.getMain().getHumidity()))
            .concat(" ").concat("Wind Speed: ").concat(String.valueOf(weatherResponse.getWind().getSpeed()).concat("km/h"));
  }

  @Override
  public String toString() {
    return "ExportValue{" +
            "text='" + text + '\'' +
            '}';
  }
}
