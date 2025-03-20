public class Patrat extends Shape2D {
    private String culoare;
    private double latura;

    public Patrat(String culoare, double latura) {
        this.culoare = culoare;
        this.latura = latura;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPerimetru() {
        return 4 * latura;
    }

    public double getAria() {
        return latura * latura;
    }
}
