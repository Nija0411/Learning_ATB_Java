package ex.lab003_loops;

class EvenOdd1To50 {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            if(i%2==0){
                System.out.println("Even: " + i);
            }else {
                System.out.println("Odd: " + i);
            }
        }
    }
}
