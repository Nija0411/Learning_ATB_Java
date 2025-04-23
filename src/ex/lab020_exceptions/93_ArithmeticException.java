package ex.lab020_exceptions;

class ArithmeticException {
    public static void main(String[] args) {

        Integer a = Integer.MAX_VALUE;
        try {
            int out = Math.addExact(a, 2);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Operation is not possible");
        }
        System.out.println("End of an Program");
    }
}
