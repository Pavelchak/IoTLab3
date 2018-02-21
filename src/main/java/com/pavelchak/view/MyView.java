package com.pavelchak.view;

import com.pavelchak.model.Bus;
import com.pavelchak.model.Manager;
import com.pavelchak.model.Tram;
import com.pavelchak.model.Transport;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MyView {

  private Map<String, String> menu;
  private Map<String, Printable> methodsMenu;
  private static Scanner input = new Scanner(System.in);
  private Manager manager;

  public MyView() {
    menu = new LinkedHashMap<>();
    methodsMenu = new LinkedHashMap<>();
    menu.put("1", "  1 - Create Manager");
    menu.put("2", "  2 - Print ManagerList");
    menu.put("3", "  3 - Sort ManagerList");
    menu.put("4", "  4 - Test text lines");
    menu.put("Q", "  Q - exit");

    methodsMenu.put("1", this::task1);
    methodsMenu.put("2", this::task2);
    methodsMenu.put("3", this::task3);
    methodsMenu.put("4", this::task4);
  }

  private void outputMenu() {
    System.out.println("\nMENU:");
    for (String str : menu.values()) {
      System.out.println(str);
    }
  }

  private void task1() {
    List<Transport> transportList = new LinkedList<>();
    transportList.add(new Bus(12.5, 4));
    transportList.add(new Tram(33.3, 4));
    transportList.add(new Bus(11.5, 8));
    transportList.add(new Bus(12.9, 6));
    transportList.add(new Tram(13.3, 5));
    transportList.add(new Tram(53.3, 5));
    manager = new Manager(transportList);
    System.out.println("Created ManagerList");
  }

  private void task2() {
    for (Transport transport : manager.getTransportList()) {
      System.out.println(transport);
    }
  }

  private void task3() {
    Comparator<Transport> comparator = (first, second) -> second.compareTo(first);
    Comparator<Transport> comparator2 = Comparator.comparing(Transport::getWeight);
    Collections.sort(manager.getTransportList(), comparator);
  }

  private void task4() {

  }

  public void show() {
    String keyMenu;
    do {
      outputMenu();
      System.out.println("Please, select menu point.");
      keyMenu = input.nextLine().toUpperCase();
      try {
        methodsMenu.get(keyMenu).print();
      } catch (Exception e) {
      }
    } while (!keyMenu.equals("Q"));
  }
}
