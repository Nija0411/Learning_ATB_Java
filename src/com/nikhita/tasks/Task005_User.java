package com.nikhita.tasks;

public class Task005_User {
    public static void main(String[] args) {
        String name = args[0];
        String st_age = args[1];
        int age = Integer.parseInt(st_age);
        String st_salary = args[2];
        int salary = Integer.parseInt(st_salary);

        System.out.println("Name of the User: " + name);
        System.out.println("Age of the User: " + age);
        System.out.println("Salary of the USer: "+ salary);
    }
}
