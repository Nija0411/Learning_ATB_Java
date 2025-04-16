package ex_lab.Lab008_constructors;

class DefaultConstructorsEx2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";
        System.out.println(c1.name); //Tesla as we have assigned a name
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println(" ----------------------------- ");

        //What if we don't assign names
        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);

    }
}

class Car{
    String name;
    int year;
    String model;

    Car(){
        //These are the custom default values assigned using constuctor.
        name = "Unknown Car";
        year = 1999;
        model = "XXX";
    }
}
