package org.example;


import net.datafaker.Faker;

public class App {
    public static void main(String[] args) {
        Faker faker = new Faker();

//        task1
        Car myCar = new Car();
        myCar.brand = faker.vehicle().manufacturer();
        myCar.model = faker.vehicle().model();
        myCar.year = faker.number().numberBetween(2014, 2024);

        myCar.printInfo();


//        task2
        // 1. პირველი კონსტრუქტორი (მხოლოდ სახელით)
        String randomName1 = faker.name().fullName();
        User user1 = new User(randomName1);

        // 2. მეორე კონსტრუქტორი (სახელით და მეილით)
        String randomName2 = faker.name().fullName();
        String randomEmail = faker.internet().emailAddress();
        User user2 = new User(randomName2, randomEmail);


// task3
        Student student = new Student();

// მონაცემების შევსება Setter-ების საშუალებით
        student.setName(faker.name().firstName());
        student.setAge(faker.number().numberBetween(18, 25));
        student.setGrade(faker.options().option("A", "B", "C", "D"));

// მონაცემების წაკითხვა Getter-ების საშუალებით
        System.out.println("სტუდენტის სახელი: " + student.getName());
        System.out.println("ასაკი: " + student.getAge());
        System.out.println("ნიშანი: " + student.getGrade());

    }


}
