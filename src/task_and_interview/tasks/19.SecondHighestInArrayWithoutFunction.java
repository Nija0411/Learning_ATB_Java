package task_and_interview.tasks;

class SecondHighestInArrayWithoutFunction {
    public static void main(String[] args) {
        int maxArray[] = {90, 100, 30, 40, 99, 89};

        int max =0;
        int secondMax =0;
        for(int i=0; i<maxArray.length; i++){
            if(maxArray[i] > max){
                secondMax = max;
                max = maxArray[i];
            }
            if(secondMax<maxArray[i] && maxArray[i]<max) {
                secondMax = maxArray[i];
            }
        }
        System.out.println("Second Highest Number in the given Array is: " + secondMax);
    }
}
