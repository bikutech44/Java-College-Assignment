class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
public class ExceptionHandlingExample2CustomException {
    public static void main(String[] args) {
        try {
            int age = 15;
            checkAge(age);
        }
        catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older.");
        }
        else{
            System.out.println("Data successfully saved.");
        }
    }
}
