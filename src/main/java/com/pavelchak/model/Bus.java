package com.pavelchak.model;

public class Bus extends Transport {

  private int wheelsAmount;

  public Bus(double weight, int wheelsAmount) {
    super(weight);
    this.wheelsAmount = wheelsAmount;
  }

  public int getWheelsAmount() {
    return wheelsAmount;
  }

  public void setWheelsAmount(int wheelsAmount) {
    this.wheelsAmount = wheelsAmount;
  }

  @Override
  public String toString() {
    return "Bus{" +
        "weight=" + getWeight() +
        "  wheelsAmount=" + wheelsAmount +
        '}';
  }
}
