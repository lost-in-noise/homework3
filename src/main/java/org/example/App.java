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


//        task4
        Calculator calc = new Calculator();

// ვაგენერირებთ შემთხვევით რიცხვებს
        int num1 = faker.number().randomDigitNotZero();
        int num2 = faker.number().randomDigitNotZero();
        int num3 = faker.number().randomDigitNotZero();

// 1. ვიძახებთ ორპარამეტრიან მეთოდს
        int result1 = calc.multiply(num1, num2);
        System.out.println("ორი რიცხვის ნამრავლი (" + num1 + " * " + num2 + ") = " + result1);

// 2. ვიძახებთ სამპარამეტრიან მეთოდს
        int result2 = calc.multiply(num1, num2, num3);
        System.out.println("სამი რიცხვის ნამრავლი (" + num1 + " * " + num2 + " * " + num3 + ") = " + result2);


//task5

        Book myBook = new Book();

// მონაცემების შევსება Faker-ით
        myBook.title = faker.book().title();
        myBook.author = faker.book().author();
        myBook.pages = faker.number().numberBetween(50, 1200);

// პირდაპირ ვბეჭდავთ ობიექტს
        System.out.println(myBook);
    }


}
