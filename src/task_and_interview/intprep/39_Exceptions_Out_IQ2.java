package task_and_interview.intprep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Exceptions_Out_IQ2 {
    //Type of Checked Exception
    /* Output:
       Starting
       C:\abc.txt (The system cannot find the file specified)
       End
    */
    public static void main(String[] args) {
        System.out.println("Starting");

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}
