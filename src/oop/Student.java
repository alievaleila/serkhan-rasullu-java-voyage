package oop;

public class Student {

    private String surname;

    private String name;

    private int age;

    private University university;

    public Student(){
        System.out.println("Student");
    }

    public String getName(){
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname(){
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public University getUniversity() {
        return university;
    }

    public Student setUniversity(University university) {
        this.university = university;
        return this;
    }
}
