package task_and_interview.intprep;

class SwitchInterview {
    public static void main(String[] args) {
        //Check whether the below given Syntax is correct or no??
        int a = 10;
        switch(a){
            case 1:
            System.out.println("The Syntax is correct");
        }
        //the above given syntax is correct but it won't print anything on the console,
        // even if you have given a System print.
        /*Because
        1. The switch statement is checking a = 10, but there is no matching case 10.
        2. Since there is no matching case and no default case, the program will not print anything
        and will simply exit.
         */
    }
}
