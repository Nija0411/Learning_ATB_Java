package ex_lab.lab001_javabasics;

public class Lab005_Typecasting {
    public static void main(String[] args) {
        //Implicit Widening - Auto Upcasting
        byte b = 10;
        int a = b;
        System.out.println(b); //10 -- No data loss & done implicitly

        //Explicit widening
        // not necessary to do explicity as JVM will do it automatically.
        int a1 = (int) b;
        System.out.println(a1);//10 -- No data loss & done explicitly,

        //Narrowing - can only be done explicitly
         int val = 200;
       //byte val1 = val;//incorrect syntax
         byte val1 = (byte) val; //this has to be done explicitly
         System.out.println(val1); //-56 bcz binary conversion will be done & byte can only store 8 bits.

        //Narrowing
        int val2 = 300;
        byte val3 = (byte) val2;
        System.out.println(val3); //44

        long phoneNo = 9916160392L;
        short phone = (short) phoneNo;
        System.out.println(phone); //-26232

        int course = 100;
        float gst = 18.45F;
//        int total = (int) (course + gst); //Valid
        int total = course + (int) gst; //valid Narrowing
        System.out.println(total); //118

        float result = course + gst; //Implicit Widening
        float res = (float)course + gst; //Explicit Widening
        System.out.println(result); //118.45
        System.out.println(res); //118.45
    }
}
