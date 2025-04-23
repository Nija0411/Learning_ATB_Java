package ex.lab022_collection_framework.c03_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorExample {
    public static void main(String[] args) {

        Student1 s1 = new Student1(24, "Nik", 827);
        Student1 s2 = new Student1(22, "Rahul", 826);
        Student1 s3 = new Student1(27, "John", 828);

        List student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);

//      Collections.sort(student); //this is not possible if not used Comparable & Comparator

        Collections.sort(student, new AgeComparator());
        System.out.println(student);

        Collections.sort(student, new NameComparator());
        System.out.println(student);

        Collections.sort(student, new RollnoComparator());
        System.out.println(student);

    }
}

class AgeComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge() - o2.getAge();
    }
}

class NameComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class RollnoComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getRollno() - o2.getRollno();
    }
}

class Student1 {

    private String name;
    private int rollno;
    private int age;

    public Student1(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

}
