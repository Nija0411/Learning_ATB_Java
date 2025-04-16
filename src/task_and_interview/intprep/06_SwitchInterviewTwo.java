package task_and_interview.intprep;

class SwitchInterviewTwo {
    public static void main(String[] args) {
        char c = 'A';

        switch (c){
            case 65:
                System.out.println("ASCII Matching");
                break;
            default:
                System.out.println("ASCII Not Matching");
        }
    }
}
//The above program is correct because the ASCII value of A is 65 hence it is matching the case