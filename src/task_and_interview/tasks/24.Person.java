package task_and_interview.tasks;

//Create a class Person, define 10 attributes, behaviour- use 4 types of methods

class Person {
    //Attributes
    String name;
    String surname;
    String address;
    int age;
    int salary;
    String phoneNumber;
    boolean isFemale;
    boolean isMarried;
    String emailAddress;
    String occupation;

    //Behaviour
    //Type 1
    public void type1() {
        System.out.println("Hello from Type1");
    }

    //Type 2
    public void type2(String name) {
        System.out.println("Hello " + name + " From Type 2");
    }

    //Type 3
    public int type3() {
        int a = 5, b = 10;
        return a + b;
    }

    //Type 4
    public String type4(String message) {
        return message;
    }

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name = "Nikhita";
        System.out.println(p1.name);

        p1.type1();

        p1.type2("John");

        int sum = p1.type3();
        System.out.println(sum);

        String msg = p1.type4("Hello, how are you??");
        System.out.println(msg);

    }
}
