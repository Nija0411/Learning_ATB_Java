package ex.lab008_constructors;

class OOPs_Constructors {
    public static void main(String[] args) {

        Baby b1 = new Baby(); //Constructor will be called 1
        Baby b2; //No obj created so no constructor call
        new Baby(); //Constructor will be called 2
//        Baby(); compile error

    }
}

class Baby{
    String name;
    int age;

    void sleep(){
        System.out.println("Sleep!!");
    }
    void eat(){
        System.out.println("Eat!!");
    }
    void cry(){
        System.out.println("Crying!!");
    }

    Baby(){
        System.out.println("This is a Default Constructor");
    }
}
