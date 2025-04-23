package task_and_interview.intprep;

class TryIQ {
    public static void main(String[] args) {

        String s1 = null;
        int i1 = 10;

        try {
            String s2 = s1.trim();
            int i2 = i1 / 0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("The above operation is not possible");
        } catch (Exception e) {
            System.out.println("Execute if above catch doesn't handled exception");
        }
    }
}
