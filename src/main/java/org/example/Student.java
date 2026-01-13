package org.example;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String grade;
    private String studentId;

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

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getStudentId() {
        return studentId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // თუ ზუსტად იგივე ობიექტია
        if (o == null || getClass() != o.getClass()) return false; // თუ სხვადასხვა კლასია
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId); // ვადარებთ მხოლოდ ID-ს
    }
}