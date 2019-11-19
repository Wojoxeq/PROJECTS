public class Zadanie31 {

    public static void main(String[] args) {

        int a = 4;
        for (a = 4; a > 0; a--) {
            System.out.println("****");
        }

        System.out.println("\n");
        for (int b = 1; b <= 4; b++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= b) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        int rows = 4;
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows - r; c++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= r; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        int number = 4;
        int k = 0;
        for(int i = 1; i <= number; ++i, k = 0) {
            for(int j = 1; j <= number - i; ++j) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
