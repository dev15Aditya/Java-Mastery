public class Example2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}

interface Animal {
    void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}