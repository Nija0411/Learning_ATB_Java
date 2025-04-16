package ex_lab.lab003_loops;

class ContinueInFor {
    public static void main(String[] args) {
        for (int i=0; i<50; i++){
            if (i==5){
                continue; //Will Skip below code
            }
            System.out.println(i);//It will skip 5
        }

    }
}
