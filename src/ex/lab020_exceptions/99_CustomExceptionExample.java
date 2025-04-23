package ex.lab020_exceptions;

class CustomExceptionExample {

    public static void main(String[] args) {

        try {
            validateAge(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18. Not allowed to vote!");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}