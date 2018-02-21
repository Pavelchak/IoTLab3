package com.pavelchak.model;

import java.util.List;

public class Manager {

  private List<Transport> transportList;

  public Manager(List<Transport> transportList) {
    this.transportList = transportList;
  }

  public List<Transport> getTransportList() {
    return transportList;
  }

  public void setTransportList(List<Transport> transportList) {
    this.transportList = transportList;
  }
}
