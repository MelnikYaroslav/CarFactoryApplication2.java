package com.example.carfactory;

public class CheapCar implements blueprint {
  public CheapCar() {
      System.out.println("CheapCar bean created");
  }
    @Override
    public void drive() {
        System.out.println("Driving slow and dull");
    }

    @Override
    public void buy() {
        System.out.println("At least I'm not bankrupt!");
    }

}
