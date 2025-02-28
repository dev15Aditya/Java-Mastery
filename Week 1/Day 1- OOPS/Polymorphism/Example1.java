public class Example1 {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        System.out.println(math.add(10, 20));
        System.out.println(math.add(5.6, 10.2));
    }
}

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}