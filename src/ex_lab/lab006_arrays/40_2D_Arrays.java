package ex_lab.lab006_arrays;

class TwoD_Arrays {
    public static void main(String[] args) {
        //Create a 2D Array -->
       /*C1[0] C2[1] C3[2] --> Column
R1[0]rows  1     2     3
R2[1]      4     5     6
R3[2]      7     8     9 */
        //1 way of creating an array
        int arr2D1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int arr2D[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr2D[0][0]);
        System.out.println(arr2D[0][1]);
        System.out.println(arr2D[0][2]);
//      System.out.println(arr2D[0][3]); //ArrayIndexOutOfBoundsException

        //2nd way
        int arr1[][] = new int[3][3]; //3 rows, 3 columns
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr1[2][0] = 7;
        arr1[2][1] = 8;
        arr1[2][2] = 9;
    }
}
