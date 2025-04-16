package task_and_interview.intprep;

class MinandMaxArray {
    public static void main(String[] args) {
        int array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int maxArray = array[0];
        for(int i=0; i< array.length; i++){
            if(array[i] > maxArray ){
                maxArray = array[i];
            }
        }
        System.out.println(maxArray);
    }
}
