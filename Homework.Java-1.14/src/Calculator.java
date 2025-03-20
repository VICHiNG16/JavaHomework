import java.io.FileNotFoundException;

public class Calculator {
    public static int calculateDouble(int x) {
        return 2 * x;
    }

    public static int calculateDoubleWithDefault(String filePath) {
        int x = 1;

        try {
            x = FileReader.readNumberFromFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Eroare: Fisierul nu a fost gasit! Se foloseste valoarea implicita x = 1.");
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Fisierul nu contine un numar valid! Se foloseste valoarea implicita x = 1.");
        }

        return calculateDouble(x);
    }
}