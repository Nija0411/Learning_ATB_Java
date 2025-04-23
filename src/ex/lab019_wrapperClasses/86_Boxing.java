package ex.lab019_wrapperClasses;

class Boxing {
    public static void main(String[] args) {

        int a =10;
        Integer b = a; //AutoBoxing
        System.out.println(b.intValue()); //10
        System.out.println(Integer.MIN_VALUE); //returns the min value (-2147483648)

        Integer a2 = 45;
        int b2 = a2; //Unboxing - remove the wrapper (attributes and functions)
        System.out.println(b2);
    }
}
