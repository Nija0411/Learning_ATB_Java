package ex.lab015_iib_and_sib;

class SIBEx {

    static int n1;
    int n3;

    /*   1. Here SIBEx is class - we are loading a class & it can be loaded only once
       2. Once the class is loaded SIB will execute only once
       3. We don't need to create an object to execute the SIB
       4. IIB's will execute the no.of times the object is created
       5. Order of execution --> SIB, IIB, Constructor and then remaining things
       6. We can't declare static variables we can only initialize
       7. Non-static variable initialization is not possible.
         */

    public static void main(String[] args) {

        SIBEx s1 = new SIBEx();

        System.out.println("Main method");

    }

    SIBEx() {
        System.out.println("Default Constructor");
    }

    {
        System.out.println("IIB Block");
    }

    static {
//      static int n=100; compile error only initialization can be done & not the declaration
        n1 = 200;
        int n2 = 100;  //this is not a non-static it's a local var to the SIB
//        n3=300; compile error non-static var are not allowed in SIB
        System.out.println("Static Initialization Block (SIB)");
        System.out.println("Instance variable: " + n2);
        System.out.println("Static variable: " + n1);
    }

}
