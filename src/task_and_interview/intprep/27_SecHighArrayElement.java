package task_and_interview.intprep;

import java.util.Arrays;

class SecHighArrayElement {
    public static void main(String[] args) {
        int arr[] = {98, 100, 50,60, 89, 99};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
     }
}
