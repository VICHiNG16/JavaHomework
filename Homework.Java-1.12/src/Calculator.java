public class Calculator {
    public static double divideByXHandled(int x) {
        try {
            return 10.0 / x;
        } catch (ArithmeticException e) {
            System.out.println("Eroare: Impartire la zero!");
            return Double.NaN;
        }
    }


    public static double divideByXThrows(int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException("Eroare: Impartire la zero!");
        }
        return 10.0 / x;
    }
}