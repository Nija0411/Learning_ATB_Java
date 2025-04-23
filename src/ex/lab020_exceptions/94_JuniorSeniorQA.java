package ex.lab020_exceptions;

import java.lang.ArithmeticException;

class JuniorSeniorQA {
    //Differences how junior & senior QA handles the exceptions occurred.
    public static void main(String[] args) {

        String a = args[0]; //java.lang.ArrayIndexOutOfBoundsException
        int a1 = Integer.parseInt(a); //java.lang.NumberFormatException
        int b = 100 / a1; //java.lang.ArithmeticException

    }
}

class Junior {
    public static void main(String[] args) {
        try {
            String a = args[0];
            int a1 = Integer.parseInt(a);
            int b = 100 / a1;
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e1) {
            System.out.println(e1.getMessage());
        } catch (ArithmeticException e2) {
            System.out.println(e2.getMessage());
        }
        System.out.println("End of a Program");
    }

}

class QA {
    public static void main(String[] args) {
        try {
            String a = args[0];
            int a1 = Integer.parseInt(a);
            int b = 100 / a1;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of an Program!!");
    }
}

class SeniorQA {
    public static void main(String[] args) {
        try {
            String a = args[0];
            int a1 = Integer.parseInt(a);
            int b = 100 / a1;
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of a Program!!");
    }
}
