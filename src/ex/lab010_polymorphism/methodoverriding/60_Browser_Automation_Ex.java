package ex.lab010_polymorphism.methodoverriding;

class Browser {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        Chrome c1 = new Chrome();
        Edge e1 = new Edge();
        IE i1 = new IE();

        b1.browser();
        c1.browser();
        e1.browser();
        i1.browser();

    }

    void browser(){
        System.out.println("Open the Browser: ");
    }
}

class Chrome extends Browser{

    void browser(){
        System.out.println("Chrome!!");
    }
}

class Edge extends Browser {
    void browser(){
        System.out.println("Edge!!");
    }
}

class IE extends Chrome{
    @Override
    void browser() {
        System.out.println("IE Browser");
    }
}
