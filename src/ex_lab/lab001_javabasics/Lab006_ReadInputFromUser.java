package ex_lab.lab001_javabasics;

public class Lab006_ReadInputFromUser {
    public static void main(String[] args) {

        //Taking input from CLI -- do edit config from above arrow --Pgm args
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result = age<18 ? "Minor" : age<=65 ? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
