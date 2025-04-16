package task_and_interview.tasks;

class EvenOddInArray {
    public static void main(String[] args) {
        int array[] = {1,50,34, 8, 9, 0, 11, 24, 30};

        System.out.println("Even Numbers:---------------------");
        for(int i=0; i< array.length; i++){
            if(array[i]%2==0) System.out.println(array[i]);
        }

        System.out.println("Odd Numbers:----------------");
        for(int i=0; i< array.length; i++){
            if(array[i]%2!=0) System.out.println(array[i]);
        }
    }
}
