package task_and_interview.tasks;

class Vehicle {
    public static void main(String[] args) {

        Vehicle veh = new Vehicle();
        Car1 car = new Car1();
        Engine eng = new Engine();

        veh.vehicle();
        car.vehicle();
        car.car();
        eng.engine();
        eng.car();
        eng.vehicle();


    }

    void vehicle() {
        System.out.println("Vehicle!!");
    }
}

class Car1 extends Vehicle {
    void car() {
        System.out.println("Car is a vehicle!!");
    }
}

class Engine extends Car1 {
    void engine() {
        System.out.println("Engine!!");
    }
}
