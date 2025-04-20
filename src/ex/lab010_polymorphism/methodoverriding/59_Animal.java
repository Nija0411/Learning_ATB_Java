package ex.lab010_polymorphism.methodoverriding;

class Animal {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Dog d1 = new Dog();
        a1.sound(); //Sound
        d1.sound(); //Bark

        Animal a2 = new Dog();
        a2.sound(); //Bark if sound is not present in Dog then sound

    }
    void sound() {
        System.out.println("Sound!!");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!!");
    }
}
