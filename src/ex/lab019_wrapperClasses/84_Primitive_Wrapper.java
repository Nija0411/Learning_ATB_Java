package ex.lab019_wrapperClasses;

class Primitive_Wrapper {
    public static void main(String[] args) {

        int a = 10; //Primitive data type
        /*
        This is not an object, it doesn't have attribute and behaviours
        int, char, short, byte, float, long, double, boolean
         */

        /*
        We will now avoid using primitive data type because we now have wrapper classes
        Which has object (attribute & behaviours)
        Which provides us a many built-in functions
         */

        Integer age = 65;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());

    }
}
