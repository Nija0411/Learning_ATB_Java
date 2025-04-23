package ex.lab019_wrapperClasses;

class Conversions {
    public static void main(String[] args) {

        String num = "10";
        int a = 10;

        // String -> Wrapper -> parseX()  ,Integer.parseInt(num);Double.parseDouble()
        Integer a1 = Integer.parseInt(num);
        Integer b1 = Integer.valueOf(num);

        // String to Primitive
        int a2 = Integer.parseInt(num);

        // String to Wrapper
        Integer a3 = Integer.parseInt(num);


        // Wrapper to String (toString method)
        System.out.println(b1.toString());

        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());
    }
}
