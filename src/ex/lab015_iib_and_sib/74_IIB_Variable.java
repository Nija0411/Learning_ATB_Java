package ex.lab015_iib_and_sib;

class IIB_Example {
    //1. We can initialize static, non-static & local variables inside IIB
    //2. Declaration of static is not possible.
    //3. Initializing static var inside IIB is not a good practice
    //4. We can't declare any method/class inside IIB
    //5. We can call static/non-static method from IIB
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
    }
}

class MyClass {
    static int a1;
    int a2;

    //IIB
    {
        a1 = 200; //static initialization
        a2 = 300; //non-static initialization
        int a3 = 400; //local declaration and initialization
        System.out.println("IIB Block");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        hello();
        hello1();
    }

    public void hello() {
        System.out.println("Non-static Method");
    }
    public static void hello1(){
        System.out.println("Static Method");
    }
}
