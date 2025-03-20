public class Main {
    public static void main(String[] args) {
        double a = 2;
        double b = -4;

        try {
            Double solution = EquationSolver.solve(a, b);
            System.out.println("Solutia ecuatiei " + a + "x + " + b + " = 0 este: x = " + solution);
        } catch (InvalidEquationException e) {
            System.out.println(e.getMessage());
        }
    }
}