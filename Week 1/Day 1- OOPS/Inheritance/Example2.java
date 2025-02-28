public class Example2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.showSpeed();
    }
}

class Vehicle {
    int speed = 50;
}

class Car extends Vehicle {
    void showSpeed() {
        System.out.println("Speed: " + speed);
    }
}