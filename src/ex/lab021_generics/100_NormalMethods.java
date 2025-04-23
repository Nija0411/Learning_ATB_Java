package ex.lab021_generics;

class NormalMethods {

    //In general to use the same method with different data types we need to create multiple methods.
    //But to overcome this issue, generics came into the picture.

    public static void main(String[] args) {

        Methods.temp_sum(3, 4);
        Methods.temp_sum(67.9, 90.89);
        Methods.temp_sum("Nikhita", "Jalapure");
    }
}

class Methods {
    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}
