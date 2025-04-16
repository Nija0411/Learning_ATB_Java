package ex_lab.lab01_javabasics;

public class Lab009_PrePostInc {
    public static void main(String[] args) {
        int a =10;
        int b = (a++ + a); //10 + 11
        int c = (a++ + ++a); //11 + 13

        System.out.println(a); //11
        System.out.println(b); //21
        System.out.println(c); //24
        System.out.println(a); //13
    }
}
