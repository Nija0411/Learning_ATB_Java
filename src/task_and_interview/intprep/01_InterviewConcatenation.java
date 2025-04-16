package task_and_interview.intprep;

class Int001_InterviewConcatenation {
    public static void main(String[] args) {
        String name = "Nikhita";
        String lastName = "Jalapure";

        int a = 10;
        int b = 10;

        System.out.println(name+ lastName + a + b); //NikhitaJalapure1010

        System.out.println(a + b + name + lastName); //20NikhitaJalapure

        System.out.println(name + lastName + (a+b)); //NikhitaJalapure20
    }
}
