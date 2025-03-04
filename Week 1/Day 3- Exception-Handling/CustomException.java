class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            int age = 17;
            if (age < 18) {
                throw new InvalidAgeException("Age is not valid");
            } else {
                System.out.println("Age is valid");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
