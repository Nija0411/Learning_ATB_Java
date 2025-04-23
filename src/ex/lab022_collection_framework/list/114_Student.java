package ex.lab022_collection_framework.list;

class Student {

    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No.:" + rollNo);
    }

    @Override
    public String toString() {
        return "{Student name=" + name +
                ", rollNo=" + rollNo + " }";
    }
}
