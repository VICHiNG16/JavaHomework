import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public static int calculateIntegerSum(String filePath) {
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    try {
                        sum += Integer.parseInt(token);
                    } catch (NumberFormatException e) {
                        continue;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return -1;
        }

        return sum;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileProcessor <filename>");
            return;
        }

        int result = calculateIntegerSum(args[0]);
        if (result != -1) {
            System.out.println("Sum of integers in file: " + result);
        }
    }
}