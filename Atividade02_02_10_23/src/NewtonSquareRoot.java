public class NewtonSquareRoot {
    public static double calculateSquareRoot(double x, double epsilon) {
        if (x < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de números negativos.");
        }

        double guess = x;
        double newGuess = 0;

        while (true) {
            newGuess = 0.5 * (guess + x / guess);

            if (Math.abs(newGuess - guess) < epsilon) {
                break;
            }

            guess = newGuess;
        }

        return newGuess;

    }
}
