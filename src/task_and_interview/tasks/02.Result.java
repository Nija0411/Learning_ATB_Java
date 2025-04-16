package task_and_interview.tasks;

class Task002_Result {
    public static void main(String[] args) {

        //³√(x² + y² - |z|) -- calculate with the below given values.

        int x = 10, y=10, z=10;

        x = (int) Math.pow(10, 2);
        y = (int) Math.pow(10, 2);
        z = Math.abs(z);

        float result = (float) Math.cbrt(x+y-z);
        System.out.println("Result of ³√(x² + y² - |z|) is: " + result);
    }
}
