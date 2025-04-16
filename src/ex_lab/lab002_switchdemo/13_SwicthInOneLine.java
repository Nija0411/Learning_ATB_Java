package ex_lab.lab002_switchdemo;

class SwicthInOneLine {
    public static void main(String[] args) {
        int a = 128;
        //If JDK > 13 & No need of break
        switch (a){
            case 128 -> System.out.println("Case 128");
            case 129 -> System.out.println("Case 129");
            default -> System.out.println("No Matching Case");
        }
    }
}
