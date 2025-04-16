package ex_lab.lab02_switchdemo;

import java.util.Scanner;

class SwitchRealLifeEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the browser name: ");
        String browser = input.next();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println("---------------");
                System.out.println("TC1");
                break;
            case "edge":
                System.out.println("Starting the Edge");
                System.out.println("---------------");
                System.out.println("TC1");
                break;
            default:
                System.out.println("No Idea about this Browser");
                break;
        }
    }
}
