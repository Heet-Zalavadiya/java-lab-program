
interface Shape {
    void getArea();
}

class Rectangle implements Shape {
    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void getArea() {
        System.out.println("Rectangle Area: " + l * b);
    }
}

class Circle implements Shape {
    int l;

    Circle(int l) {
        this.l = l;
    }

    public void getArea() {
        System.out.println("Circle Area: " +Math.PI* l * l);
    }
}

class Triangle implements Shape {
    int b;
    int h;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public void getArea() {
        System.out.println("Triangle Area: " + 0.5 * b * h);
    }
}

public class Shape_main {
    public static void main(String[] args) {
        Shape s =new Circle(10);
        Shape s1 =new Rectangle(10,20);
        Shape s2 =new Triangle(10, 10);
        s.getArea();
        s1.getArea();
        s2.getArea();

    }
}
