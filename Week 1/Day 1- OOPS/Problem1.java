public class Problem1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
