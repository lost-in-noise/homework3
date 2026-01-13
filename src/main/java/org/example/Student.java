package org.example;

public class Student {
    private String name;
    private int age;
    private String grade;

    // Setter მეთოდები - მნიშვნელობების მისანიჭებლად
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Getter მეთოდები - მნიშვნელობების წასაკითხად
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}