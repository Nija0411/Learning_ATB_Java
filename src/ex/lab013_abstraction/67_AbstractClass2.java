package ex.lab013_abstraction;

class AbstractClass2 {
    public static void main(String[] args) {

        WagonR wr = new WagonR();
        wr.drive();

    }
}

abstract class Car {

    public abstract void startCar();
    public abstract void stopCar();

}

class WagonR extends Car {

    @Override
    public void startCar() {
        System.out.println("Starting the Car!!");
    }

    @Override
    public void stopCar() {
        System.out.println("Stopping the Car!!");
    }

    public void drive(){
        startCar();
        stopCar();
    }
}
