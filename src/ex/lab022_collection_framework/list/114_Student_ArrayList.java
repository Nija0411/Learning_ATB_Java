package ex.lab022_collection_framework.list;

import java.util.ArrayList;
import java.util.List;

class Student_ArrayList {
    public static void main(String[] args) {
        Student s1 = new Student("Nikhita", "827");
        Student s2 = new Student("Rahul", "828");
        Student s3 = new Student("Pallavi", "829");

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
