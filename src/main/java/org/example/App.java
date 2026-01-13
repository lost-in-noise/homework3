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

        // 1. პირველი კონსტრუქტორი (მხოლოდ სახელით)
        String randomName1 = faker.name().fullName();
        User user1 = new User(randomName1);

        // 2. მეორე კონსტრუქტორი (სახელით და მეილით)
        String randomName2 = faker.name().fullName();
        String randomEmail = faker.internet().emailAddress();
        User user2 = new User(randomName2, randomEmail);


    }


}
