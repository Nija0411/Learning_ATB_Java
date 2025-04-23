package task_and_interview.intprep;

import java.util.ArrayList;
import java.util.Scanner;

class UserInput_ArrayList {
    public static void main(String[] args) {
        // Multiple inputs from the user and store them in separate
        // names, ages - store them

        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList();

        String continueInput = "Y"; //Control var for loop

        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.print("Enter the Name: ");
            String name = input.next();
            names.add(name);

            System.out.print("Enter the Age: ");
            int age = input.nextInt();
            ages.add(age);

            System.out.print("You want to add more list (Y/N): ");
            continueInput = input.next();
        }

        for (String s : names) {
            System.out.println(s);
        }

        for (int i : ages) {
            System.out.println(i);
        }

        input.close();

    }
}
