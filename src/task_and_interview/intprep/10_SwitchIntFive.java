package task_and_interview.intprep;

class SwitchIntFive {
    //What is the output of the below code? --> None
    public static void main(String[] args) {
        char code = 'C';
        switch(code){
            default -> System.out.println("None");
            case 'A' -> System.out.println(65);
            case 'B' -> System.out.println(66);
//          case 'C' -> System.out.println(67);
        }
    }
}