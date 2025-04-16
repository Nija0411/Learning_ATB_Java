package task_and_interview.intprep;

class SwitchIntFour {
    //What is the output of the below code? --> Matching -1
    public static void main(String[] args) {
        int a =10;

        switch (-1){
            default:
                System.out.println("None");
                break;
            case 10:
                System.out.println("Matching 10");
                break;
            case -1:
                System.out.println("Matching -1");
                break;
            case 2:
                System.out.println("Matching 2");
                break;
        }
    }
}
