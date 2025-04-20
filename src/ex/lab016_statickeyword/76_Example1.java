package ex.lab016_statickeyword;

class Example1 {

    int a =100;
    static int b=200;

    public static void main(String[] args) {
        Example1 ex = new Example1();
        ex.staticEx();
        staticEx1();
        Example1.staticEx1(); //the above & this way are valid
    }

    void staticEx(){
        System.out.println("--------------------\nNon-static Method");
        System.out.println(a); //100
        System.out.println(b); //200
    }
    static void staticEx1(){
        System.out.println("--------------------\nStatic Method");
//      System.out.println(a); Compile error
        Example1 ex = new Example1();
        System.out.println(ex.a); //need to create object

        System.out.println(b);
    }

}

