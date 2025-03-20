import java.util.Objects;

public class Adresa {
    private String strada;
    private String oras;
    private String codPostal;

    public Adresa(String strada, String oras, String codPostal) {
        this.strada = strada;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    // Getteri si setteri
    public String getStrada() { return strada; }
    public void setStrada(String strada) { this.strada = strada; }

    public String getOras() { return oras; }
    public void setOras(String oras) { this.oras = oras; }

    public String getCodPostal() { return codPostal; }
    public void setCodPostal(String codPostal) { this.codPostal = codPostal; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresa adresa = (Adresa) o;
        return Objects.equals(strada, adresa.strada) &&
                Objects.equals(oras, adresa.oras) &&
                Objects.equals(codPostal, adresa.codPostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strada, oras, codPostal);
    }

    @Override
    public String toString() {
        return strada + ", " + oras + ", " + codPostal;
    }
}