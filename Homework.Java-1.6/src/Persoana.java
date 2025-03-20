public class Persoana {
    private String nume;
    private Adresa adresa;

    public Persoana(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    // Getteri si setteri
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public Adresa getAdresa() { return adresa; }
    public void setAdresa(Adresa adresa) { this.adresa = adresa; }

    @Override
    public String toString() {
        return "Nume: " + nume + ", Adresa: " + adresa;
    }
}