package ex_lab.lab004_functions;

class UserDefinedFunctions {
    public static void main(String[] args) {
        /*1. Without Parameter without return type
        2. Without Parameter but with return type
        3. With Parameters and without return type
        4. With parameter with return type*/
        hello1();

        String msg = hello2();
        System.out.println(msg);

        hello3("Nikhita", 24, 50000);

        int sum = hello4(10,20);
        System.out.println(sum);
    }
    static void hello1(){
        System.out.println("Hello From Type1");
    }

    static String hello2(){
        System.out.println("Hi");
        return "Hello From Type2";
    }

    static void hello3(String name, int age, int salary){
        System.out.println("Hello From Type3");
        System.out.println("My name is "+name+" age is "+age+" salary is " +salary);
    }

    static int hello4(int a, int b){
        System.out.println("Hello From Type4");
        return a+b;
    }

}
