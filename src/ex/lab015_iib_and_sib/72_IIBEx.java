package ex.lab015_iib_and_sib;

class IIBEx {
    static int n2;

    IIBEx() {
        System.out.println("Default Constructor");
    }

    {
        int n;
        n = 100;
        int n1 = 200;

//      static int n2=100; static variables can't be initialized
        n2 = 200;

        System.out.println(n1);
        System.out.println(IIBEx.n2);

        System.out.println("Class IIB Block");
    }

    public static void main(String[] args) {
        IIBEx ex = new IIBEx();

        //This is just a local block and not the IIB
        {
            System.out.println("Local Block");
        }

    }
}
