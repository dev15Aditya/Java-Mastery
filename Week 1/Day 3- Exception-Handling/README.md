# Exception Handling in Java

## What is Exception Handling?

Exception handling is a way to handle runtime errors and prevent crashes in Java programs.

Java provides a `try-catch-finally` mechanism to catch and handle exceptions.

### 1. Try-Catch-Finally

- A `try` block contains the code that might throw an exception.
- A `catch` block handles the exception.
- The `finally` block is always executed.

### 2. Custom Exceptions

You can create your own exception class by extending `Exception`.

#### How do you create a custom exception?

**Steps:**

1. Extend the `Exception` class.
2. Create a constructor to accept error messages.
3. Throw the custom exception when needed.

**Example:**

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```
## Checked vs Unchecked Exceptions

### Checked Exception
- **Description:** Checked at compile time. You must handle it using `try-catch` or `throws`.
- **Example:** `IOException`, `SQLException`

### Unchecked Exception
- **Description:** Checked at runtime. These are due to logical errors in code.
- **Example:** `NullPointerException`, `ArithmeticException`

## Answering Questions

### What is the difference between `throw` and `throws`?

| Feature | `throw` | `throws` |
|---------|---------|----------|
| **Purpose** | Used to throw an exception manually | Declares that a method might throw an exception |
| **Used Inside** | Inside a method | In the method signature |
| **Example** | `throw new Exception("Error");` | `void myMethod() throws IOException {}` |
