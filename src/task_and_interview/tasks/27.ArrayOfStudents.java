package task_and_interview.tasks;

import java.util.Arrays;

class ArrayOfStudents {
    public static void main(String[] args) {

        ATBStudents atb = new ATBStudents(new String[]{"Sakhi", "Sam", "Nik"});
        //Access using toString method
        System.out.println(atb.toString());

        //Access using getters
        System.out.println(atb.getStudent()[0]); //Won't work

        System.out.println(Arrays.toString(atb.getStudent())); //Correct way
    }
}

class ATBStudents {

    private String student[];

    ATBStudents(String students[]) {
        this.student = students;
    }

    public String[] getStudent() {
        return student;
    }

    public void setStudent(String[] student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "ATBStudents {" + Arrays.toString(student) + "}";
    }
}
