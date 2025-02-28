public class Example1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        sound();
        System.out.println("Bark!");
    }
}