package ex_lab.lab007_class_objects;

class OOPs {
    public static void main(String[] args) {
        Person amit; //created a ref variable & not a object

        //Object1
        Person p1 = new Person();
        p1.name = "Lucky";
        System.out.println(p1.name);//Lucky

        //Object 2
        Person p2 = new Person();
        p2.name = "Pramod";
        System.out.println(p2.name); //Pramod

        //Object 3
        new Person().name = "No reference";//A object without any reference.
        //Object 4
        System.out.println(new Person().name); //null, default value of name (if name is not initialized)

        //In the above objects
        //Person is a class
        //p1 & p2 are the object reference variable
        // new Person() are the objects.
    }
}
class Person{
    //Every class will have
    // Attribute / Properties / Data members / Instance variables / Class variables
    String name;
    String phoneNumber;
    String color_eyes;
    int legs;
    byte age;
    double salary;
    double weight;
    boolean isMale;


    //Behaviour / Functions / Methods
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greetings(String name){
        return "Hello" + name;
    }

    void talk(){

    }

    int inHandSalary(int salary, int tax){
        return (salary-tax);
    }
}
