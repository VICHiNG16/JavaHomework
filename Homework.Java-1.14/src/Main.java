import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1; // Valoare implicită

        while (true) {
            System.out.print("Introduceti un numar intreg: ");
            String input = scanner.nextLine();

            try {
                x = Integer.parseInt(input);
                break; // Ieșim din buclă dacă numărul este valid
            } catch (NumberFormatException e) {
                System.out.println("Eroare: Valoarea introdusa nu este un numar intreg valid. Încercati din nou.");
            }
        }

        int result = Calculator.calculateDouble(x);
        System.out.println("Rezultatul calculului 2 * x este: " + result);
    }
}