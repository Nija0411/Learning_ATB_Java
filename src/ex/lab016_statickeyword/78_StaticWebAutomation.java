package ex.lab016_statickeyword;

class StaticWebAutomation {
    public static void main(String[] args) {

        System.out.println(Automation.driver);

        Automation t1 = new Automation();
        Automation t2 = new Automation();

        System.out.println(t1.driver);
        System.out.println(t2.driver);
    }
}

class Automation{
    static String driver = "Chrome";
}
