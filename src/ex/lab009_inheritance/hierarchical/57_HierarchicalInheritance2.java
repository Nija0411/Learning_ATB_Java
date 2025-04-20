package ex.lab009_inheritance.hierarchical;

class HierarchicalInheritance2 {
    public static void main(String[] args) {

        Father f1 = new Father();
        Nikhita n1 = new Nikhita();

        f1.home();
        n1.home();
        n1.nikhita_home();

        Rahul r1 = new Rahul();
        r1.rahul_home();
        r1.home();
//      r1.nikhita_home(); compile error


        //  f1.nikhita_home(); compile error
        //    n1.rahul_home(); compile error
    }
}

class Father {
    void home() {
        System.out.println("Father's Home");
    }
}

class Nikhita extends Father {
    void nikhita_home() {
        System.out.println("Nikhita's home");
    }
}

class Rahul extends Father {
    void rahul_home() {
        System.out.println("Rahul's Home");
    }
}
