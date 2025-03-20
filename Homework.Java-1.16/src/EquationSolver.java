public class EquationSolver {
    public static Double solve(double a, double b) throws InvalidEquationException {
        if (a == 0) {
            if (b == 0) {
                throw new InvalidEquationException("Ecuatia are infinitate de solutii (orice x este solutie).");
            } else {
                throw new InvalidEquationException("Ecuatia nu are solutii (este imposibila).");
            }
        }
        return -b / a; // Solutia unica
    }
}