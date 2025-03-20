public class Main {
    public static void main(String[] args) {
        String filePath = "input.txt";
        int result = Calculator.calculateDoubleWithDefault(filePath);
        System.out.println("Rezultatul calculului 2 * x este: " + result);
    }
}