import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ana", 8.5));
        studenti.add(new Student("Mihai", 7.2));
        studenti.add(new Student("Ioana", 9.1));

        System.out.println("Lista nesortata: " + studenti);

        studenti.sort((s1, s2) -> Double.compare(s1.getNota(), s2.getNota()));

        System.out.println("Lista sortata dupa nota: " + studenti);
    }
}