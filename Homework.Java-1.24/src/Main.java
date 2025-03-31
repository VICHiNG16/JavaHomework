public class Main {
    public static void main(String[] args) {
        String filename = "input.txt";
        int sum = FileProcessor.calculateIntegerSum(filename);

        if (sum != -1) {
            System.out.println("Total sum of integers: " + sum);
        } else {
            System.err.println("Error processing file. Make sure input.txt exists.");
        }
    }
}