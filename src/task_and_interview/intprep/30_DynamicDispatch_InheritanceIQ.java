package task_and_interview.intprep;

class DynamicDispatch_InheritanceIQ {
    public static void main(String[] args) {

//        assigning parent object into child reference is not possible
//        Father f1 = new GrandFather(); Compile error
//        Son s1 = new Father(); Compile error
//        Son s1 = new GrandFather();

        GrandFather gf = new Father(); //Father object
        GrandFather gf1 = new Son(); //son object
        GrandFather gf2 = new GrandFather(); //Grand Father object

        gf.grand();

        Father f1 = new Son();
        f1.grand();
        f1.father();
//      f1.son();

//      gf1.son();  Error
        gf1.home(); //Call's son's method only if the same name method is present in grand father too

        gf.home(); // call's father method

    }
}

class GrandFather {

    int grandF = 90;

    void grand() {
        System.out.println("Method Grand Father: ");
    }

    void home() {
        System.out.println("Grand Father Home");
    }
}

class Father extends GrandFather {

    int father = 60;

    void father() {
        System.out.println("Method Father: ");
    }

    void home() {
        System.out.println("Father Home");
    }
}

class Son extends Father {

    int son = 30;

    void son() {
        System.out.println("Method Son");
    }

    void home() {
        System.out.println("Son Home");
    }
}