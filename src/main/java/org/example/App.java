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


//        task6
        BankAccount account = new BankAccount();
// ვაგენერირებთ შემთხვევით ბალანსს 0-დან 500-მდე
        account.balance = faker.number().randomDouble(2, 0, 500);

        account.checkLimit();


//        task7
        Product product = new Product();
        product.price = faker.number().randomDouble(2, 50, 500);
        product.discount = faker.number().randomDouble(2, 5, 40);

        System.out.println("პროდუქტის ფასი: " + product.price);
        System.out.println("ფასდაკლება: " + product.discount);
        System.out.println("საბოლოო ფასი: " + product.calculateFinalPrice());


//        task8
        User userWithAddress = new User(faker.name().fullName(), faker.internet().emailAddress());
        Address addr = new Address();
        addr.city = faker.address().city();
        addr.street = faker.address().streetAddress();

        userWithAddress.address = addr; // ვაბამთ მისამართს იუზერს

        System.out.println("მომხმარებელი: " + userWithAddress.name + " ცხოვრობს აქ: " + userWithAddress.address);



//        task9
        Student s1 = new Student();
        String sharedId = faker.idNumber().valid();
        s1.setStudentId(sharedId);

        Student s2 = new Student();
        s2.setStudentId(sharedId); // ორივე სტუდენტს აქვს ერთი და იგივე ID

        System.out.println("სტუდენტების ID ერთიდაიგივეა? " + s1.equals(s2)); // გამოიტანს true-ს
    }


}
