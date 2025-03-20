import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SegmentDeDreapta segment = new SegmentDeDreapta("Negru", 5);
        System.out.println("Lungimea segmentului: " + segment.getLungime());

        List<Shape2D> forme2D = new ArrayList<>();
        forme2D.add(new Patrat("Rosu", 4));
        forme2D.add(new Cerc("Albastru", 3));

        double totalPerimetru = 0;
        for (Shape2D forma : forme2D) {
            totalPerimetru += forma.getPerimetru();
        }
        System.out.println("Perimetrul total al patratelor și cercurilor: " + totalPerimetru);

        double totalArie = 0;
        List<Shape> forme = new ArrayList<>();
        forme.add(new Patrat("Galben", 5));
        forme.add(new Cerc("Verde", 2));
        forme.add(new Sfera("Alb", 3));
        forme.add(new Cub("Maro", 4));

        for (Shape forma : forme) {
            if (forma instanceof Shape2D) {
                totalArie += ((Shape2D) forma).getAria();
            } else if (forma instanceof Shape3D) {
                totalArie += ((Shape3D) forma).getAria();
            }
        }
        System.out.println("Aria totala a tuturor formelor: " + totalArie);

        double totalVolum = 0;
        List<Shape3D> forme3D = new ArrayList<>();
        forme3D.add(new Sfera("Mov", 3));
        forme3D.add(new Cub("Portocaliu", 2));

        for (Shape3D forma : forme3D) {
            totalVolum += forma.getVolum();
        }
        System.out.println("Volumul total al sferelor și cuburilor: " + totalVolum);
    }
}
