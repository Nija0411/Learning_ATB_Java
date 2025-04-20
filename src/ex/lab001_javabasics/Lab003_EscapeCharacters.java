package ex.lab001_javabasics;

public class Lab003_EscapeCharacters {
    public static void main(String[] args) {
        char new_line ='\n';
        char tab_space = '\t';
        char backspace = '\b';
        char carriage_return = '\r';

        System.out.println("Nikhita" + new_line + "Jalapure");
        System.out.println("Nikhita" +'\t'+ "Jalapure");
        System.out.println("Nikhitaj" + backspace + "Jalapure");
        System.out.println("Jalapure" +'\r'+ "Nikhita");

    }
}
