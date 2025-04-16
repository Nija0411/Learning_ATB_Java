package task_and_interview.tasks;

//Create a class where we have a DC, PC - 2 types

class Person1 {
    public static void main(String[] args) {
        System.out.println("Calling Default Constructor: ");
        Person2 p1 = new Person2();
        System.out.println("Name :" + (p1.name));
        System.out.println("Age :" + (p1.age));
        System.out.println("Address: " + (p1.address));
        if (p1.isMale == true) {
            System.out.println("Gender: Male");
        } else {
            System.out.println("Gender: Female");
        }
        System.out.println(p1.phoneNumber);

        System.out.println(" ---------------------------------- ");
        System.out.println("Calling PC1");
        Person2 p2 = new Person2("Nikhita", 25, "BLR", "99098765", false);
        System.out.println("Name :" + (p2.name));
        System.out.println("Age :" + (p2.age));
        System.out.println("Address: " + (p2.address));
        System.out.println(p2.phoneNumber);
        if (p2.isMale == true) {
            System.out.println("Gender: Male");
        } else {
            System.out.println("Gender: Female");
        }

        System.out.println(" ---------------------------------- ");
        System.out.println("Calling PC2: ");
        Person2 p3 = new Person2("Rahul", 22, true);
        System.out.println("Name: " +(p3.name));
        System.out.println("Age: "+(p3.age));
        System.out.println("Gender: "+(p3.isMale));
        System.out.println("Address: "+(p3.address));

        System.out.println(" ---------------------------------- ");
        System.out.println("Print Details with Default Constructor: ");
        p1.printDetails();
        System.out.println("Print Details with Parameterized Constructor");
        p2.printDetails();

        p3.printDetails();

        p3.eat();
    }
}

class Person2 {
    String name;
    int age;
    String address;
    String phoneNumber;
    boolean isMale;

    /*Behaviour
      eat, sleep, walk, doHomework, printDetails
     */
    public void eat() {
        System.out.println("Eating!!");
    }

    public void sleep() {
        System.out.println("Sleeping!!");
    }

    public void walk() {
        System.out.println("Walking!!");
    }

    public void doHomework() {
        System.out.println("Home work!!");
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        if (isMale) {
            System.out.println("Gender: Male");
        } else {
            System.out.println("Gender: Female");
        }
    }

    //DC
    Person2() {
        name = "Sakhi";
        age = 25;
        address = "ABC";
        phoneNumber = "9900990990";
        isMale = false;
    }

    //PC
    Person2(String name, int age, String address, String phoneNumber, boolean isMale) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isMale = isMale;
    }

    //PC
    Person2(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

}