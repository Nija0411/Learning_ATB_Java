package ex.lab014_interfaces;

class InterfaceEx2 {
    public static void main(String[] args) {
        BMW b1 = new BMW();
        b1.drive();
    }
}

class BMW implements Brake, Engine {

    @Override
    public void applyBreak() {
        System.out.println("Break is implemented");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine is implemented");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine is implemented");
    }

    void drive() {
        applyBreak();
        startEngine();
        stopEngine();
    }
}

interface Brake {
    void applyBreak();
}

interface Engine {
    void startEngine();

    void stopEngine();
}
