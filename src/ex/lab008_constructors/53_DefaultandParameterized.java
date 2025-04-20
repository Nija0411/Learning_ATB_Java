package ex.lab008_constructors;

class DefaultandParameterized {
    public static void main(String[] args) {

        NewClass nc = new NewClass();
        nc.name = "Nikhita";  // ✅ Can be set after object creation
        nc.age = 25;
        System.out.println(nc.name + " - " + nc.age);

        NewClass nc2 = new NewClass("Rahul", 22);
        System.out.println(nc2.name + " - " + nc2.age);

        // Values Can still be changed
        nc2.name = "Pallavi";  // ✅ Values can still be changed
        nc2.age = 26;
        System.out.println(nc2.name + " - " + nc2.age);


    }
}

class NewClass{
    String name;
    int age;

    //DC
    NewClass() {
        // No parameters, fields stay at default or can be set here
    }

    //PC
    NewClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
