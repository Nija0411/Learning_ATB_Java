package ex.lab006_arrays;

class Matrix3X3 {
    //Print a 3X3 matrix
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //for loop to print the Rows (matrix.length)
        for (int i = 0; i < matrix.length; i++) {
            //for loop to print the columns (matrix[i].length)
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
