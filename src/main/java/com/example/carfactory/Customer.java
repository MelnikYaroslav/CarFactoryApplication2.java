package com.example.carfactory;

public class Customer {

    private CheapCar cheap;
    private String nameSurname;
    private int money;

    public Customer(CheapCar cheap) {
        System.out.println("Customer bean created");
        this.cheap = cheap;
    }
    public void buyCar(){
        System.out.println("Oh well..");
        cheap.buy();
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
