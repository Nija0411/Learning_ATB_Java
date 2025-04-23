package ex.lab021_generics;

class GenericsClass {
    public static void main(String[] args) {

        temp_sum(3, 4);
        temp_sum(3.34, 4.45);
        temp_sum("Nikhita", "Jalapure");
    }

    //<G> can be anything it might be <T>, <Hello> <G> or anything
    static <G> G temp_sum(G a, G b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
