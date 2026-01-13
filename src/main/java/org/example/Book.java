package org.example;

public class Book {
    public String title;
    public String author;
    public int pages;

    // toString მეთოდის გადაფარვა
    @Override
    public String toString() {
        return "წიგნის დასახელება: '" + title + "', ავტორი: " + author + ", გვერდები: " + pages;
    }
}
