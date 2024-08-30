import java.util.Scanner;

public class linearInterpolation {
    public static double interpolate(double x0, double y0, double x1, double y1, double x) {
        return y0 + (y1 - y0) * (x - x0) / (x1 - x0);
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
        System.out.print("Enter x (interpolation point): ");
        double x = scanner.nextDouble();

        double result = interpolate(x0, y0, x1, y1, x);
        System.out.println("Linear Interpolation Result: " + result);

        scanner.close();
    }
}
