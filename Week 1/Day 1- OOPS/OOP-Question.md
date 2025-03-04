# OOP Concepts in Java

1. Inheritance
- Inheritance allows a child class to inherit properties and behavior from a parent class.

2. Polymorphism
* Method Overloading (Compile-time Polymorphism)
- Multiple methods with the same name but different parameters.

* Method Overriding (Runtime Polymorphism)
- A subclass provides a specific implementation of a method already defined in the parent class.

3. Abstraction
- Abstraction hides implementation details and only shows relevant data.

* Using Abstract Class
* Using Interface

4. Encapsulation
- Encapsulation is achieved using private fields and public getter/setter methods.

## Questions and Answers
1. What is the difference between an abstract class and an interface?

- An abstract class can have both abstract (no implementation) and concrete (implemented) methods, while an interface can only have abstract methods (before Java 8).
- A class can extend only one abstract class but can implement multiple interfaces.
- Abstract classes can have constructors, but interfaces cannot.

2. How does super() work in inheritance?
- super() is used to call the parent class constructor inside a subclass constructor.
- Example:
```
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
```

- Output:
```
Parent constructor
Child constructor
```

3. What is runtime polymorphism?

- Runtime polymorphism is method overriding, where a subclass provides a specific implementation of a method from the parent class.
Example:

```class Animal {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound(); // Output: Bark!
    }
}
```

4. Why is encapsulation important?

- Encapsulation hides data from direct modification.
- It ensures data security by allowing controlled access via getter and setter methods.
Example: A banking system should not allow unauthorized access to modify an account’s balance.