package task_and_interview.tasks;

class Shape {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.circle();
        circle.shape();

        System.out.println("--------------------------------");
        Triangle tr = new Triangle();
        tr.triangle_shape();
        tr.shape();

        System.out.println("--------------------------------");
        Rectangle rec = new Rectangle();
        rec.ractangle_shape();
        rec.shape();

    }

    void shape() {
        System.out.println("Shapes!!");
    }

}

class Triangle extends Shape {
    void triangle_shape() {
        System.out.println("Method Triangle!!");
    }
}

class Rectangle extends Shape {
    void ractangle_shape() {
        System.out.println("Method Rectangle!!");
    }
}

class Circle extends Shape {
    void circle() {
        System.out.println("Method Circle!!");
    }
}
