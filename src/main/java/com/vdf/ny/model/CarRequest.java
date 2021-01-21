package com.vdf.ny.model;

public class CarRequest {
private String carType;

  public CarRequest() {
  }

  public CarRequest(String carType) {
    this.carType = carType;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }
}
