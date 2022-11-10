package com.example.carfactory;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarFactoryApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        // Dependency Injection + Inversion of Control
        Customer human = context.getBean("newCustomer", Customer.class);
        human.buyCar();
        System.out.println(human.getNameSurname());
        System.out.println(human.getMoney());
        context.close();
    }

}
