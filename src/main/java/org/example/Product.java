package org.example;

public class Product {
    public double price;
    public double discount;

    // მეთოდი, რომელიც აბრუნებს ფასს ფასდაკლების შემდეგ
    public double calculateFinalPrice() {
        return price - discount;
    }
}
