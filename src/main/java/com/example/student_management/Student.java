package com.example.student_management;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private int mobNo;

    public Student() {
    }

    public Student(int rollNo, String name, int age, int mobNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }
}
