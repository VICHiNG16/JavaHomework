import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    // Metode
    public void addStudent(Student student) {
        studenti.add(student);
    }

    public void removeStudent(Student student) {
        studenti.remove(student);
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    // Getteri
    public String getNumeCurs() { return numeCurs; }
    public Profesor getProfesor() { return profesor; }
    public List<Student> getStudenti() { return studenti; }

    @Override
    public String toString() {
        return "Curs: " + numeCurs + ", Profesor: " + profesor.getNume() + ", Studenti: " + studenti.size();
    }
}