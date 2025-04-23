package ex.lab020_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Throws {
    public static void main(String[] args) throws Exception {

        hello();

        FileInputStream fileInputStream = new FileInputStream("C://a.log");
        String s1 = null;
        s1.trim();
        int a = 10 / 0;
        File file = new File("");
    }

    static void hello() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
