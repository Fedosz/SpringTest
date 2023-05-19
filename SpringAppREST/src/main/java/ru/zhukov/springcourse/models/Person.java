package ru.zhukov.springcourse.models;

import org.springframework.beans.factory.annotation.Value;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;
    @Min(value = 4, message = "Person should be older than 4 years")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Enter valid email")
    private String email;

    public Person(int id, String name, int age, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
    }

    public Person() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
