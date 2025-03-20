public class Sfera extends Shape3D {
    private String culoare;
    private double raza;

    public Sfera(String culoare, double raza) {
        this.culoare = culoare;
        this.raza = raza;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPerimetru() {
        return 0;
    }

    public double getAria() {
        return 4 * Math.PI * raza * raza;
    }

    public double getVolum() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raza, 3);
    }
}