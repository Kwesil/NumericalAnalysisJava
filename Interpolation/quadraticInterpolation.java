import java.util.Scanner;

public class quadraticInterpolation {
    public static double interpolate(double x0, double y0, double x1, double y1, double x2, double y2, double x) {
        double L0 = ((x - x1) * (x - x2)) / ((x0 - x1) * (x0 - x2));
        double L1 = ((x - x0) * (x - x2)) / ((x1 - x0) * (x1 - x2));
        double L2 = ((x - x0) * (x - x1)) / ((x2 - x0) * (x2 - x1));

        return y0 * L0 + y1 * L1 + y2 * L2;
    }

    public static double trueFunction(double x) {
        return Math.pow(x, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x0: ");
        double x0 = scanner.nextDouble();
        System.out.print("Enter y0: ");
        double y0 = scanner.nextDouble();
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x (interpolation point): ");
        double x = scanner.nextDouble();

        double interpolatedValue = interpolate(x0, y0, x1, y1, x2, y2, x);
        double trueValue = trueFunction(x);
        double error = Math.abs(trueValue - interpolatedValue);

        System.out.println("Quadratic Interpolation Result: " + interpolatedValue);
        System.out.println("True Value: " + trueValue);
        System.out.println("Error: " + error);

        scanner.close();
    }
}