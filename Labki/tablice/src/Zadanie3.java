import java.util.Random;

public class Zadanie3 {

    public static void main(String[] args) {
        int tab[] = new int[10];
        
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(101);
        }
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println("Wartosc na indeksie: " + i
                    + " : " + tab[i]);
        }
    }
}
