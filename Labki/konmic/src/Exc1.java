import java.util.Scanner;

public class Exc1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź wartość zmiennoprzecinkową dla a: ");
        double a = scanner.nextDouble();
        System.out.println("Wprowadź wartość zmiennoprzecinkową dla b: ");
        double b = scanner.nextDouble();
        if(a < 00 || b < 0.0){
            System.out.println("Wprowadź wartości większe od 0!");
        }else{
            double result = ((a+a)/b + ((a/b)*a)/b + 1/a);
            System.out.println("Rezultat działania: " + result);
        }

    }

}
