package task_and_interview.intprep;

class ExceptionIQ {
    /*In Java, ArithmeticException is a subclass of Exception.
      When you catch the superclass (Exception) first, the more specific catch block (ArithmeticException)
      becomes unreachable — Java doesn’t allow that.*/
    public static void main(String[] args) {
        int a = 100;
        try {
            int out = a / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception after using Exception obj is not allowed");
//        }
        System.out.println("Ending the Program Here");
    }
}

class ExceptionIQFix {
    public static void main(String[] args) {
        int a = 100;
        try {
            int out = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception before using Exception obj is allowed");
        } catch (Exception e) {
            System.out.println("Execute if exception is not handled by Arithmetic e");
        }

        System.out.println("Ending the Program Here");
    }
}
