package task_and_interview.intprep;

interface InterfaceRapidIQ {
    //1. Can we Create main method in an Interface? --> Yes
    public static void main(String[] args) {}

    //2. Can we create object of interface? --> No, but ref var can be created
    //    InterfaceRapidIQ iq = new InterfaceRapidIQ(); Compile error

    //3. Constructors --> not allowed
    //   InterfaceRapidIQ(){ } compile error

    //4. Is the below syntax correct? --> yes
    interface I1 {
    }

    //5. Can we create multiple interfaces in a single class/interface? --> Yes
    interface I2 {
    }

    //6. Can we create class inside interface and interface inside class? --> yes
    class A3 {
        interface I4 {
        }
    }

    //7. Is the below syntax for class correct? --> Yes
    class A5 {
    }

    //8. Check the below syntax correct/no
    class A6 extends A5 {
    } //Valid

    //   class A5 extends A6{} Invalid
    //   class A6 extends A3{} Invalid
    //   class A7 extends I2{} Invalid
    class A7 implements I2 {
    } //Valid implements keyword

    class A8 extends A5 implements I2, I1 {
    } //Valid

    //   class A9 implements I2 extends A8{} Invalid extends need to be used first
    class A9 extends A7 {
    } //Valid

    interface I5 extends I1 {
    } //valid interface to interface use extends

//    interface I6 implements A7 {
//Interface to Class: Not possible, since interfaces can't extend classes.
// Classes implement interfaces.


}

