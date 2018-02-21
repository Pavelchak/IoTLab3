package com.pavelchak.model;

public class Tram extends Transport {

  private int carriage;

  public Tram(double weight, int carriage) {
    super(weight);
    this.carriage = carriage;
  }

  public int getCarriage() {
    return carriage;
  }

  public void setCarriage(int carriage) {
    this.carriage = carriage;
  }

  @Override
  public String toString() {
    return "Tram{" +
        "weight=" + getWeight() +
        "  carriage=" + carriage +
        '}';
  }
}
