package ex.lab012_superKeyword;

class SuperKeywordEx {
    public static void main(String[] args) {

//        Motor m1 = new Motor(); //This will call both the DC
//        m1.display(); //display from child will execute

        Motor m2 = new Motor(100); //This will call both the PC
//        m2.msg(); //msg from parent will execute if msg is not there in child
    }
}

class Vehicle {
    int min_speed = 80;
    private int max_speed = 180;

    public int getMax_speed() {
        return max_speed;
    }

    Vehicle() {
        System.out.println("Default Parent Constructor");
    }

    Vehicle(int a) {
        System.out.println("PC Parent");
    }

    void msg() {
        System.out.println("Parent Message");
    }

    void msg(String greet) {
        System.out.println(greet);
    }

    void display() {
        System.out.println("Display a Message");
    }
}

class Motor extends Vehicle {
    private int max_speed = 280;

    Motor() {
//        super(); // implicit call even if you don't write the super in case of default const
        System.out.println("Child DC");
    }

    Motor(int a) {
        super(100);
        System.out.println("Child PC");
    }

    @Override
    void display() {
        System.out.println("Overridden Method");
        System.out.println(super.getMax_speed()); //variable access
        System.out.println(super.min_speed); //var access
        System.out.println(this.max_speed);
        System.out.println(this.min_speed);
        super.msg();
        super.msg("Hello From Parent"); //method access
        super.display();

    }
}
