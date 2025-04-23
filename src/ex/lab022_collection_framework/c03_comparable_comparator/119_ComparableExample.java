package ex.lab022_collection_framework.c03_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableExample {
    //Comparing with multiple sorting criteria is not possible with Comparable
    //It supports only one natural ordering defined inside the class using compareTo()
    //For multiple custom orderings, Comparator should be used


    public static void main(String[] args) {

        Student s1 = new Student(24, "Nikhita", "827");
        Student s2 = new Student(22, "Rahul", "828");
        Student s3 = new Student(20, "Sakhi", "826");

        List myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        Collections.sort(myStudent); //this is not possible if not used Comparable & Comparator
        System.out.println(myStudent);

    }
}

class Student implements Comparable<Student> {
    private String name;
    private String rollno;
    private int age;

    public Student(int age, String name, String rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }

    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age;
//    }

    //Comparing with multiple objects is not possible in comparable
//    public int compareTo(Student o) {
//        return this.rollno.compareTo(o.rollno);
//    }

    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }


}
