package task_and_interview.intprep;

class Excpetions_Out_IQ {
    //What is the output? -->
    // div by Zero
    // I will be executed anyhow!!
    public static void main(String[] args) {
        double pi = 3.14;
        int a = 0;

        try {
            int out = 10 / a;
        } catch (Exception e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }
    }
}
