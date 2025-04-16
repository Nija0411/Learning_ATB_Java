package ex_lab.lab003_loops;

class DoWhileLoop {
    public static void main(String[] args) {
        //Initialization, Statement & Updation, Condtion
        //Whether the condition is true/false the statement will execute atlist once in do-while.
        int a =0;
        do{
            System.out.println("do-while block");
            System.out.println(a);
            a++;
        }while(a<10);
    }

}
