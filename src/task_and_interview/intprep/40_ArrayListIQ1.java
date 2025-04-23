package task_and_interview.intprep;

import java.util.ArrayList;
import java.util.Collections;

class ArrayListIQ1 {
    public static void main(String[] args) {

        ArrayList marks = new ArrayList<>();
        marks.add(98);
        marks.add(97);
        marks.add(56);
        marks.add(100);

        //Sorting
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        //Reverse sort
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
