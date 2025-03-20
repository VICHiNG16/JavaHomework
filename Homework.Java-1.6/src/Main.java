import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creare adrese
        Adresa adresaProf = new Adresa("Strada Profesorilor", "Craiova", "123456");
        Adresa adresaStud = new Adresa("Strada Studentilor", "Craiova", "654321");

        // Creare profesor si studenti
        Profesor profesor = new Profesor("Ganea", adresaProf, "Automatica");
        Student student1 = new Student("Maria", adresaStud, 2);
        Student student2 = new Student("Andrei", adresaStud, 3);

        // Creare curs
        Curs curs = new Curs("Programare Java", profesor);
        curs.addStudent(student1);
        curs.addStudent(student2);

        // Afisare detalii
        System.out.println(curs);
        System.out.println("Profesor: " + profesor);
        System.out.println("Studenti: " + curs.getStudenti());
    }
}