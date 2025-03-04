public class Problem2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());

        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length, breadh;

    Rectangle(double length, double breadh) {
        this.length = length;
        this.breadh = breadh;
    }

    @Override
    public double area() {
        return length * breadh;
    }
}