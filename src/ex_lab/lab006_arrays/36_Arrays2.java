package ex_lab.lab006_arrays;

class Arrays2 {
    public static void main(String[] args) {
        int marks1[] = {1, 2, 3, 4, 5, 6};

        int marks2[] = new int[5]; //Creatinng a fixed size array
        int[] marks3 = new int[5];

        String names[] = new String[3];
        names[0] = "Nikhita";
        names[1] = "Rahul";
        names[2] = "RJ";
//        names[3] = "JR"; //ArrayIndexOutOfBoundsException
//        names[4] = "PQR";ArrayIndexOutOfBoundsException

        System.out.println(marks1); //[I@6f496d9f
        System.out.println(marks2); //[I@723279cf
        System.out.println(names);  //[Ljava.lang.String;@10f87f48
        System.out.println(names[0]); //Nikhita
        System.out.println(marks1[5]); //6

    }
}
