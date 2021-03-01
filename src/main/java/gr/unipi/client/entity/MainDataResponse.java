package gr.unipi.client.entity;

public class MainDataResponse {
  private double temp;
  private double feels_like;
  private double temp_min;
  private double temp_max;
  private double humidity;

  public double getTemp() {
    return temp;
  }

  public void setTemp(double temp) {
    this.temp = temp;
  }

  public double getFeels_like() {
    return feels_like;
  }

  public void setFeels_like(double feels_like) {
    this.feels_like = feels_like;
  }

  public double getTemp_min() {
    return temp_min;
  }

  public void setTemp_min(double temp_min) {
    this.temp_min = temp_min;
  }

  public double getTemp_max() {
    return temp_max;
  }

  public void setTemp_max(double temp_max) {
    this.temp_max = temp_max;
  }

  public double getHumidity() {
    return humidity;
  }

  public void setHumidity(double humidity) {
    this.humidity = humidity;
  }
}
