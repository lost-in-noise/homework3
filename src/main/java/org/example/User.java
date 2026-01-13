package org.example;

public class User {
    public String name;
    public String email;

    // 1. პირველი კონსტრუქტორი: იღებს მხოლოდ სახელს
    public User(String name) {
        this.name = name;
        System.out.println("მომხმარებელი მხოლოდ სახელით: " + name);
    }

    // 2. მეორე კონსტრუქტორი: იღებს სახელს და მეილს
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("მომხმარებელი სახელით: " + name + " და მეილით: " + email);
    }
}
