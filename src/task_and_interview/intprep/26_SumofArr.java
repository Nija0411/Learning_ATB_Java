package task_and_interview.intprep;

class SumofArr {
    public static void main(String[] args) {
        int arr[] = {10,20,36};

        int sum=0;
//        for(int i=0; i<arr.length; i++){
//            sum+=arr[i];
//        }
//        System.out.println("Sum is: " +sum);

        //Using for-each
        for(int n:arr){ //n represents element where i in above loop represents index number.
            sum+=n;
        }
        System.out.println("Sum using for-each is: " +sum);
    }
}
