package ex.lab014_interfaces;

class MultipleInheritace {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();

    }
}

interface Mother {
    void money();
}

interface Father {
    void money();
}

class Child implements Mother, Father {

    @Override
    public void money() {
        System.out.println("Child implemented Money");
    }
}
