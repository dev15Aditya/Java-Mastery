public class Example2 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}
