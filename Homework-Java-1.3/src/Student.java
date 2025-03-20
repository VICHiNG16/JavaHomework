public class Student {
    private String nume;
    private int varsta;
    private String facultate;
    private double medie;

    // Constructor
    public Student(String nume, int varsta, String facultate, double medie) {
        this.nume = nume;
        this.varsta = varsta;
        this.facultate = facultate;
        this.medie = medie;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "Student {" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", facultate='" + facultate + '\'' +
                ", medie=" + medie +
                '}';
    }
}