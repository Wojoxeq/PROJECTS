import java.util.Random;

public class Zadanie6 {
    public static void main(String[] args){
        int tab[][] = new int[100][100];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i][i] = r.nextInt(101);

        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int suma = 0;
        int nr = 0;

        for(int i =0;i<tab.length;i++) {
            if(tab[i][i] > largest) {
                largest = tab[i][i];
            }
        }

        for(int i =0;i<tab.length;i++) {
            if(tab[i][i] < smallest) {
                smallest = tab[i][i];
            }
        }

        for(int i = 0;i<tab.length;i++) {
            suma = suma + tab[i][i];
        }

        int srednia = suma/tab.length;

        System.out.println("Najwiekszy numer: " +largest);
        System.out.println("Najmniejszy numer: " +smallest);
        System.out.println("Suma wszystkich składnikow: " +suma);
        System.out.println("Srednia skladnikow: " +srednia);
    }
}
