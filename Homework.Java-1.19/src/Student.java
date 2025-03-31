public class Student {
    private String nume;
    private double nota;

    public Student(String nume, double nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nume + " (" + nota + ")";
    }
}