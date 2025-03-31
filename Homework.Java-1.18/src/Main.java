import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numere = Arrays.asList(5, 2, 9, 1, 3, 7);

        System.out.println("Lista inainte de sortare: " + numere);

        SortareLista.sorteaza(numere);
        System.out.println("Lista dupa sortare: " + numere);
    }
}