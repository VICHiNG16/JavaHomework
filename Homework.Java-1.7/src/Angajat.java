public class Angajat extends Persoana {
    private Companie companie;

    public Angajat(String nume, Adresa adresa, Companie companie) {
        super(nume, adresa);
        this.companie = companie;
    }

    // Getteri si setteri
    public Companie getCompanie() { return companie; }
    public void setCompanie(Companie companie) { this.companie = companie; }

    @Override
    public String toString() {
        return super.toString() + ", Companie: " + (companie != null ? companie.getNume() : "N/A");
    }
}