package org.example;


import net.datafaker.Faker;

public class App {
    public static void main(String[] args) {
        Faker faker = new Faker();

        Car myCar = new Car();
        myCar.brand = faker.vehicle().manufacturer();
        myCar.model = faker.vehicle().model();
        myCar.year = faker.number().numberBetween(2014, 2024);


        myCar.printInfo();
    }
}
