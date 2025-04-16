package ex_lab.Lab008_constructors;

class ConstructorEx2 {
    public static void main(String[] args) {
        WebAutomation wAuto = new WebAutomation();
    }
}

class WebAutomation {
    // Default Constructor
    WebAutomation() {
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("You can do anything which you want to do, when Object is created.");
//      FileInputStream fileInputStream = new FileInputStream("C://a.txt");

    }
}
