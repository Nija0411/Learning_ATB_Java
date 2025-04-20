package task_and_interview.intprep;

//What is the o/p of the below code? compile error bcz return statement is missing.
class Solution {

    public int getSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.getSum(10,20));
    }
}
