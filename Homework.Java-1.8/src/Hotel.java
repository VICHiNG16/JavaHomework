import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nume;
    private Adresa adresa;
    private List<Turist> turisti;

    public Hotel(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.turisti = new ArrayList<>();
    }

    // Metode
    public void addTurist(Turist turist) {
        turisti.add(turist);
        turist.setHotel(this);
    }

    public void removeTurist(Turist turist) {
        turisti.remove(turist);
        turist.setHotel(null);
    }

    // Getteri
    public String getNume() { return nume; }
    public Adresa getAdresa() { return adresa; }
    public List<Turist> getTuristi() { return turisti; }

    @Override
    public String toString() {
        return "Hotel: " + nume + ", Adresa: " + adresa + ", Turisti: " + turisti.size();
    }
}