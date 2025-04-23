package ex.lab020_exceptions;

import java.lang.ArithmeticException;

class Throw {
    public static void main(String[] args) {
        dividedByZero(5);

    }
    static void dividedByZero(int a){
        int b = 100/a;

        if(a==0){
            throw new ArithmeticException();
        }
        else {
            System.out.println(b);
        }
    }
}
