package ex.lab006_arrays;

class Arrays {
    public static void main(String[] args) {
        //declaring an array
        int[] arr1;
//      arr[] = {1, 2}; // ❌ Invalid

        int[] arr2 = {1, 2}; //Correctway

        int arr3[];
        arr3 = new int[]{1, 2};

        int arr[] = {51, 91, 92, 99, 89, 92};
//      int [] arr  = {51, 91, 92, 99, 89, 92}; another way to create an array
        System.out.println(arr.length); //6
        System.out.println(arr[0]); //51
        System.out.println(arr[2]); //92
        System.out.println(arr[5]); //92
//      System.out.println(arr[6]); //ArrayIndexOutofBound
//      System.out.println(arr[-1]); //ArrayIndexOutofBound

        String arr4[] = {"Hello", "World", "Hi"};
        boolean isMarried[] = {true, true, false};
    }
}
