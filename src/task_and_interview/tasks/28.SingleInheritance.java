package task_and_interview.tasks;

class Vehical {
    public static void main(String[] args) {
        Car car = new Car();
        car.car();
        car.vehical();
    }

    void vehical() {
        System.out.println("Any Vehicle: ");
    }
}

class Car extends Vehical {

    void car() {
        System.out.println("Car: ");
    }

}
