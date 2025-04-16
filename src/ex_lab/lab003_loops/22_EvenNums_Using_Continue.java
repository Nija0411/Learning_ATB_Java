package ex_lab.lab003_loops;

class EvenNums_Using_Continue {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++){
            if(i%2==0){
                System.out.println("Even:" + i);
                continue; //Means it will skip the if condition in below code
            }
            System.out.println("Odd: " + i);
        }
    }
}
