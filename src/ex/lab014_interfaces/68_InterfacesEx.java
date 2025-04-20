package ex.lab014_interfaces;

class InterfacesEx {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.area(10, 10);

        Square sq = new Square();
        sq.area(2, 3);
    }

}

interface Polygon {

    void area(int length, int breadth);
}

class Square implements Polygon {

    @Override
    public void area(int length, int breadth) {
        System.out.println("Area of a Square is: " + 4 * length);
    }
}

class Rectangle implements Polygon {

    @Override
    public void area(int length, int breadth) {
        System.out.println("Area of a Ractangle: " + length * breadth);
    }
}
