package ex_lab.lab01_javabasics;

public class Lab004_Operators {
    public static void main(String[] args) {
        //1. Assignment Operators
        int a = 100;
        int b = a + 1;

        //2. Arithmetic operator
        int c = 20, d = 10;
        int addition = c + d; //30
        int subtraction = c - d; //10
        int mul = c * d; //200
        int div = c / d; //2
        int mod = c % d; //0

        //3. Relational Operators
        int e = 10, f = 20;
        System.out.println(e<f); //true
        System.out.println(e>f); //false
        System.out.println(e==f); //false
        System.out.println(e<=f); //true
        System.out.println(e>=f); //false
        System.out.println(e!=f); //true

        //4. new operator
        Lab004_Operators lab = new Lab004_Operators();

        //5. instanceof Operator
        System.out.println("\n"+ (lab instanceof Lab004_Operators)); //true

        //6. Logical AND OR and NOT operators
        int num = 100, num1 =200, num3=100;
        System.out.println();
        System.out.println(num>num1 && num>num3); // false
        System.out.println(num>num1 || num>=num3); // true
        System.out.println(!(num>num1)); //true

        //7. Unary Operators
        int x=5, y=10;
        System.out.println(x++); // Output: 5 (then x becomes 6)
        System.out.println(++y); // Output: 11 (y becomes 11 first)

        System.out.println(x--); // Output: 6 (then x becomes 5)
        System.out.println(--y); // Output: 10 (y becomes 10 first)

        //8. Unary Minus Operator (-)
        int n =10, n1=-10;
        System.out.println(-n); //-10
        System.out.println(-n1); //10

        //9. Compound Assignment Operators
        int p=5, q=6;
        p +=1; // p = p+1=6
        p -=1; // p = p-1 = 5
        p *=1; // p = p * 1 = 5
        p /=1; // p = p/1 = 5
        p %=1; // p = p%1 = 0

        //10. Ternary Operators --> if else condition in a single statement;
        int age =10;
        //Syntax:  result_var = condition? If (condition) : else (condition)
        String canIVote = age>=18 ? "Yes you can Vote": "No You can't";
        System.out.println(canIVote);

        int num2 =0;
        int result = num2>0? 1 : 2;
        System.out.println(result);

        //Nested Ternary
        int number = 5;
        String resul = number>10 ?  (number>20 ? "N>20" : "N<20") : (number<10 ? "B" : "A");
        System.out.println(resul);

        //11. Bitwise Operators
    }
}
