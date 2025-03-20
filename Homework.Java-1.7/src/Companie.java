import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String nume;
    private Adresa adresa;
    private List<Angajat> angajati;

    public Companie(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.angajati = new ArrayList<>();
    }

    // Metode
    public void addAngajat(Angajat angajat) {
        angajati.add(angajat);
        angajat.setCompanie(this);
    }

    public void removeAngajat(Angajat angajat) {
        angajati.remove(angajat);
        angajat.setCompanie(null);
    }

    // Getteri
    public String getNume() { return nume; }
    public Adresa getAdresa() { return adresa; }
    public List<Angajat> getAngajati() { return angajati; }

    @Override
    public String toString() {
        return "Companie: " + nume + ", Adresa: " + adresa + ", Angajati: " + angajati.size();
    }
}