package task_and_interview.tasks;

import java.util.Scanner;

class SecHighestNumberinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Your array elements are: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int highest = 0, secondhighest =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>highest){
                secondhighest = highest;
                highest = arr[i];
            }
        }
        System.out.println("Second highest Number from Array is: "+secondhighest);
    }
}
