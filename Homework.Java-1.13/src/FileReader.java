import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static int readNumberFromFile(String filePath) throws FileNotFoundException, NumberFormatException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNext()) {
            scanner.close();
            throw new NumberFormatException("Fisierul este gol!");
        }

        String content = scanner.next();
        scanner.close();
        return Integer.parseInt(content);
    }
}