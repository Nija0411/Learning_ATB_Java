package ex.lab013_abstraction;

class AbstractClass {
    public static void main(String[] args) {

        Child child = new Child();
        child.loan50k();
        child.loan25k();

//        Father f1 = new Father(); Object of an abstract class can't be created but reference var can be created

        Father f2 = new Child();
        f2.loan25k();
        f2.loan50k();
    }
}

abstract class Father {

    abstract void loan50k();

    void loan25k() {
        System.out.println("25k Given");
    }
}

class Child extends Father {

    @Override
    void loan50k() {
        System.out.println("Child has given the loan");
    }
}
