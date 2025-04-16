package ex_lab.lab006_arrays;

import java.util.Scanner;

class ArrayUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of an Array: ");
        int size = input.nextInt();

        int marks[] = new int[size];
        System.out.print("Enter the marks");
        for(int i=0; i<marks.length; i++){
            marks[i] = input.nextInt();
        }
        System.out.print("Arrays of Marks is: ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
