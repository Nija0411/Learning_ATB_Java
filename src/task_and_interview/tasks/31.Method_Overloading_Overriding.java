package task_and_interview.tasks;

class Bank {
    public static void main(String[] args) {

        Bank b1 = new Bank();
        b1.bank();
        b1.bank("SBI");

        SBI s1 = new SBI();
        s1.bank("SBI");
    }

    void bank() {
        System.out.println("Average interest rate in bank is: 9%");
    }

    //Method Overloading
    void bank(String name) {
        System.out.println("Interest in " + name + " is 8%");

    }
}

class SBI extends Bank {

    @Override
    void bank(String name) {
        System.out.println("Interest in " + name + " is 10%");
    }
}
