package ex.lab020_exceptions;

class Try_Catch_Finally {
    //finally will always execute after the try block, whether an exception is thrown or not, caught or not.
    public static void main(String[] args) {

        try {
            int output = 100 / 0;
            System.out.println("Output is: "+output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally will always execute");
        }

    }
}
