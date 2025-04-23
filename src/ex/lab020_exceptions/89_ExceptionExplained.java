package ex.lab020_exceptions;

class ExceptionExplained {
    public static void main(String[] args) {

        System.out.println("Starting the Program");
        String input = args[0]; //java.lang.ArrayIndexOutOfBoundsException (if no args passed)
        int a = Integer.parseInt(input); //java.lang.NumberFormatException (invalid String conversion)
        int output = 100 / a; //java.lang.ArithmeticException (if divided by 0)
        System.out.println(output);
        System.out.println("Ending the program");
    }
}
