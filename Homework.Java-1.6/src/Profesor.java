public class Profesor extends Persoana {
    private String departament;

    public Profesor(String nume, Adresa adresa, String departament) {
        super(nume, adresa);
        this.departament = departament;
    }

    // Getteri si setteri
    public String getDepartament() { return departament; }
    public void setDepartament(String departament) { this.departament = departament; }

    @Override
    public String toString() {
        return super.toString() + ", Departament: " + departament;
    }
}