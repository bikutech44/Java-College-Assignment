public class ExceptionHandlingExample1DivideByZero {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero. "+ ex.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
