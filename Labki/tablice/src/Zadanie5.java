import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args){
        int tab[][] = new int[100][100];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i][i] = r.nextInt(101);
        }
        System.out.println("Pierwszy kat: " + tab[0][0]);
        System.out.println("Drugi kat: " + tab[tab.length-1][tab.length-1]);
    }
}
