package ex_lab.lab008_constructors;

class ParameterizedConstructor {
    public static void main(String[] args) {

        Car2 c1 = new Car2(); //This will call a default constuctor
        System.out.println(c1.name);

        //this refers to the current object hence it will refer to the c2
        // means c2 details will be there in the constructor.
        Car2 c2 = new Car2("Tesla", "Model 3", 2015);
        System.out.println(c2.name);

        Car2 c3 = new Car2();
        System.out.println(c3.name); //DC

        Car2 c4 = new Car2("TATA", "NANO", 2000);
        System.out.println(c4.year);
        System.out.println(c2.name);
    }

}

class Car2 {
    String name;
    int year;
    String model;

    //DC
    Car2() {
        name = "Unknown Car";
        year = 1990;
        model = "XXX";
    }

    //Parameterized
    Car2(String name, String model, int launched_year) {
        this.name = name;
        this.model = model;
        this.year = launched_year;
    }
}
