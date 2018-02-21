package com.pavelchak.model;

public abstract class Transport implements Comparable<Transport> {
  private double weight;

  public Transport(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public int compareTo(Transport o) {
    if (this.weight < o.getWeight()) return -1;
    if (this.weight > o.getWeight()) return 1;
    return 0;
  }
}
