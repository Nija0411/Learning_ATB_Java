package ex.lab007_class_objects;

class Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Leo";
//        System.out.println(c1); //Memory address
        System.out.println(c1.name); //Leo

        c1.play(); //Meoooooooooo

        Cat c2; //No object
//        c2.play(); //Compile error

        new Cat().play(); //Meoooooooo
        System.out.println(new Cat().name); //Meo
    }
}

class Cat{
    String name = "Meo";

    void play(){
        System.out.println("Meoooooooo");
    }
}
