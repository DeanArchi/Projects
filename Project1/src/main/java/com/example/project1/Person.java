package com.example.project1;

public class Person {
    private String firstName;
    private String secondName;
    private String age;

    public Person(String name, String secondName, String age) {
        this.firstName = name;
        this.secondName = secondName;
        this.age = age;
    }

    public Person() {
        super();
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
