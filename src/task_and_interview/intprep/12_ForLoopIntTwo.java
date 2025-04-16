package task_and_interview.intprep;

class ForLoopIntTwo {
    //What will happen if we skip condition?? --> Infinite loop
    public static void main(String[] args) {
        for (int i=0; ; i++){
            System.out.println(i);
        }
    }
}
//Exit code 130 -- (Stop by yourself-kill) Red button interrupted by signal
//Exit code 0   -- Successfull Execution
