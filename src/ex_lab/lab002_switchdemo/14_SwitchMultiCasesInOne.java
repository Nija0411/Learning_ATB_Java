package ex_lab.lab002_switchdemo;

class SwitchMultiCasesInOne {
    public static void main(String[] args) {
        int itemCode = 006;

        //If JDK>13
        switch (itemCode){
            case 001, 002, 003:
                System.out.println("All are electronic gadgets");
                break;
            case 004, 005, 006:
                System.out.println("All are Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
