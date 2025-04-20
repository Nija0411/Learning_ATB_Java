package ex.lab011_encapsulation;

//Without using constructor assigning values through setters and accessing through getters
class Encapsulation3 {
    public static void main(String[] args) {

        Person p1 = new Person();
//        System.out.println(p1.getName());//null

        p1.setName("Nikhita", 19);
        System.out.println(p1.getName());

        p1.setAge(20);
        System.out.println(p1.getAge());

        p1.setCity("Bengaluru");
        System.out.println(p1.getCity());
    }
}

class Person {

    String name;
    int age;
    String city;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int age) {
        if (age >= 18) {
            this.name = name;
        } else {
            System.out.println("Please name it after 18 years");
        }
    }
}
