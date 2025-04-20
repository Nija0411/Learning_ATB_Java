package ex.lab012_superKeyword;

class Super1 {
    //You can only use this or super to call constructor using both in a same constructor is not possible.
    public static void main(String[] args) {
        Super2 sup = new Super2();
    }

    Super1() {
        System.out.println("Parent Default Const");
    }

    Super1(String greet) {
        System.out.println("Parent PC");
    }
}

class Super2 extends Super1 {

    Super2() {
//      super(); implicit super call even if you don't write it
//        super("Hello"); //but if you call the PC then it won't call the DC, hence Parent PC is called
        this(100);
        System.out.println("Child Default Const");
    }

    Super2(int a) {
        System.out.println("Child PC");
    }

}

