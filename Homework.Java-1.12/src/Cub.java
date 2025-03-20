public class Cub extends Shape3D {
    private String culoare;
    private double latura;

    public Cub(String culoare, double latura) {
        this.culoare = culoare;
        this.latura = latura;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPerimetru() {
        return 12 * latura;
    }

    public double getAria() {
        return 6 * latura * latura;
    }

    public double getVolum() {
        return latura * latura * latura;
    }
}