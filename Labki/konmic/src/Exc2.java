import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exc2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź wartość dla a: ");
        int a = scanner.nextInt();

        System.out.println("Wprowadź wartość dla b: ");
        int b = scanner.nextInt();

        System.out.println("Wprowadź wartość dla c: ");
        int c = scanner.nextInt();

        double delta = pow(b, 2) - (4 * a * c);
        if (delta == 0) {
            double x0 = -b/(2*a);
            System.out.println("Delta wynosi " + delta + ", x0 wynosi: " + x0);
        } else if (delta > 0) {
            double x1 = (-b - sqrt(delta)) / (2 * a);
            double x2 = (-b + sqrt(delta)) / (2 * a);
            System.out.println("Delta wynosi " + delta + ", x1 wynosi: " + x1 + " a x2 wynosi: " + x2);

        } else {
            System.out.println("Delta wynosi " + delta + ", brak rozwiązania!");
        }
    }
}
