public class Student extends Persoana {
    private int anStudiu;

    public Student(String nume, Adresa adresa, int anStudiu) {
        super(nume, adresa);
        this.anStudiu = anStudiu;
    }

    // Getteri si setteri
    public int getAnStudiu() { return anStudiu; }
    public void setAnStudiu(int anStudiu) { this.anStudiu = anStudiu; }

    @Override
    public String toString() {
        return super.toString() + ", An studiu: " + anStudiu;
    }
}