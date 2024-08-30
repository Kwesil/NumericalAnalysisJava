import java.util.Scanner;

// Higher degree interpolation
public class LagrangeInterpolation {
    public static double interpolate(double[] x, double[] y, double value) {
        int n = x.length;
        double result = 0.0;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    term = term * (value - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }

    public static double trueFunction(double x) {
        return Math.pow(x, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of data points: ");
        int n = scanner.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter x" + i + ": ");
            x[i] = scanner.nextDouble();
            System.out.print("Enter y" + i + ": ");
            y[i] = scanner.nextDouble();
        }

        System.out.print("Enter the x value for interpolation: ");
        double value = scanner.nextDouble();

        double interpolatedValue = interpolate(x, y, value);
        double trueValue = trueFunction(value);
        double error = Math.abs(trueValue - interpolatedValue);

        System.out.println("Lagrange Interpolation Result: " + interpolatedValue);
        System.out.println("True Value: " + trueValue);
        System.out.println("Error: " + error);

        scanner.close();
    }
}

