package task_and_interview.intprep;

class MultiLevelInheritanceIQ {
    // Child class can access both parent and parent of parent class members and self class members too
    // But parent class can't access child class members.
    public static void main(String[] args) {

        Parent parent = new Parent();
        //Accessing same class variable
        int amount = parent.parent_var;
        System.out.println(amount);
        parent.parentMethod();

        //Accessing child class variable
        // parent.parent2_var; compile error


        Parent2 parent2 = new Parent2();
        //Accessing parent class variable

        Child child = new Child();
        //Accessing parent class members
        System.out.println(child.parent_var); //Can access super parent
        System.out.println(child.parent2_var); //can access parent
        System.out.println(child.child_var); //can access self

        child.parentMethod();
        child.parent2Method();
        child.childMethod();

    }


}

class Parent {

    int parent_var = 100;

    void parentMethod() {
        System.out.println("Parent Method: ");
    }
}

class Parent2 extends Parent {

    int parent2_var = 200;

    void parent2Method() {
        System.out.println("Parent 2 Method: ");
    }
}

class Child extends Parent2 {

    int child_var = 300;

    void childMethod() {
        System.out.println("Child Method: ");
    }
}
