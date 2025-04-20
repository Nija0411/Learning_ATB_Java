package task_and_interview.tasks;

//Create the class of ATB, define attributes & getter setter method
class ATB {
    public static void main(String[] args) {

        ATB1 atb = new ATB1("Sakhi", "9988776655", "BLR", 24);

        System.out.println("[ " + atb.getName() + ", " + atb.getPhoneNumber() + ", "
                + atb.getAddress() + ", " + atb.getAge() + " ]");

        atb.setAddress("Bengaluru");
        System.out.println(atb.getAddress());


    }
}

class ATB1 {

    private String name;
    private String phoneNumber;
    private String address;
    private int age;


    ATB1(String name, String phoneNumber, String address, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
