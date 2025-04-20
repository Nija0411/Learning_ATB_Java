package ex.lab015_iib_and_sib;

class SIB {
    //1. We can only initialize static variables inside SIB, declaration is not allowed
    //2. We can't declare/initialize non-static variables inside SIB
    //3. We can declare & initialize local variables inside SIB
    //4. We can only access static methods inside SIB and not the non-static
    static int n;
    int n1;

    public static void main(String[] args) {
    }

    static {
//      static int n=100; compile error
        n = 100;
//      n1 =200; non-static initialization is not allowed
        int n2 = 300; //local initialization

        hello1();
//      hello(); non-static method call not allowed

        System.out.println(n);
        System.out.println(n2);
    }

    void hello() {
        System.out.println("Non-static method");
    }

    static void hello1() {
        System.out.println("Static Method");
    }
}

