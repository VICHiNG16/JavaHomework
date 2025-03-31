import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public void calculateSum() {
        Scanner scanner = new Scanner(System.in);
        Double number1 = null;
        Double number2 = null;

        number1 = readNumber(scanner, "Enter first number: ");
        number2 = readNumber(scanner, "Enter second number: ");

        if (number1 != null && number2 != null) {
            System.out.println("Sum: " + (number1 + number2));
        } else {
            System.out.println("Invalid input. Cannot calculate sum.");
        }
        scanner.close();
    }

    private Double readNumber(Scanner scanner, String message) {
        System.out.print(message);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number!");
            scanner.nextLine();
            return null;
        }
    }
}