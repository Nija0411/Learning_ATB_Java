package ex_lab.lab03_loops;

class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("------------------------");
        for(int j=0; j<10; ++j){
            System.out.println(j);
        }
    }
    //The above both loops will give the same output
}
