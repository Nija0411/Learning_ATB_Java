package ex_lab.Lab009_inheritance.single;

class Inheritance {

    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_gms);
        f1.bhk2();
//      f1.bhk3(); //Compile error

        Son s1 = new Son();
        System.out.println(s1.gold_gms);
        s1.bhk3();
        s1.bhk2();
    }
}

class Son extends Father {
    void bhk3() {
        System.out.println("Son: 3BHK");
    }
}

class Father {
    int gold_gms = 1000;

    void bhk2() {
        System.out.println("Father: 2BHK");
    }
}