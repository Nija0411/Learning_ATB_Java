package ex.lab011_encapsulation;

class Encapsulation2 {

    //Assinging values through constructor and accessing those using getter method

    public static void main(String[] args) {

        Bank b1 = new Bank("Sakhi", 500000);
        System.out.println(b1.getName());
        System.out.println(b1.getBalance());

    }
}

class Bank {
    private int balance;
    private String name;

    Bank(String name, int bal){
        this.name = name;
        this.balance = bal;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
