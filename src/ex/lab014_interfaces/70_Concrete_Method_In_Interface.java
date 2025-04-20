package ex.lab014_interfaces;

interface DefaultKeyword {

    int a = 100;
//    a =200; interface variables are final by default

    public static void main(String[] args) {
//  DefaultKeyword df = new DefaultKeyword();  Object of an interface can't be created

        int a = 100;
        a = 200; //local var values can be changed

        DefaultKeyword d1 = new MyClass();
        d1.complete();
        d1.incomplete();
//      d1.complete1(); compile error
        DefaultKeyword.complete1();

    }

    void incomplete();

    default void complete() {
        System.out.println("This is a complete method using default keyword");
    }

    static void complete1() {
        System.out.println("This is a complete method using static keyword");
    }
}

class MyClass implements DefaultKeyword {

    @Override
    public void incomplete() {
        System.out.println("Implemented an incomplete method");
    }
}


