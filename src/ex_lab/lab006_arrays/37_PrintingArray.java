package ex_lab.lab006_arrays;

class PrintingArray {
    public static void main(String[] args) {
        int marks[] = new int[7];
        marks[0] = 90;
        marks[5] = 100;
        marks[1] = 35;
        marks[2] = 89;
        marks[3] = 99;
        marks[4] = 90;

        System.out.println(marks);//[I@6f496d9f

        //To print all the elements
//      Arrays.sort(marks); use if you want to sort array in asc order
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); //90 35 89 99 90 100 0
        }
    }
}
