package xceptionsEx;
class AgeNotMajorException extends Exception {
    AgeNotMajorException(String message) {
        super(message);
    }
}

public class Customexception {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new AgeNotMajorException("Age " + age + " is less than 18 minor");
            }
            System.out.println("Eligible to vote");
        } catch (AgeNotMajorException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
