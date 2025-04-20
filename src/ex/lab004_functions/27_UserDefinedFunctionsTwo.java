package ex.lab004_functions;

import java.util.Scanner;

class UserDefinedFunctionsTwo {
    public static void main(String[] args) {
        //Calculate the Sum, Sub, Mul, Div and Mod of the 2 numbers.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1=0;
        if(input.hasNextInt()){
            num1 = input.nextInt();
        }else{
            System.out.println("Please enter a numeric input");
            System.exit(0);
        }
        System.out.print("Enter the second number: ");
        int num2=0;
        if(input.hasNextInt()){
            num2 = input.nextInt();
        }else {
            System.out.println("Please enter a numeric input");
            System.exit(0);
        }
        int sum = sum(num1, num2);
        System.out.println(sum);
        int sub = sub(num1, num2);
        System.out.println(sub);
        int mul = mul(num1, num2);
        System.out.println(mul);
        int div = div(num1, num2);
        System.out.println(div);
        int mod = mod(num1, num2);
        System.out.println(mod);

    }
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }
    public static int mul(int num1, int num2){
        return num1*num2;
    }
    public static int div(int num1, int num2){
        if(num2==0){
            System.out.println("Enter a second number greater than 0");
            System.exit(0);
        }
        return num1/num2;
    }
    public static int mod(int num1, int num2){
        return num1%num2;
    }
}
