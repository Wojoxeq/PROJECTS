import java.util.Random;

public class Zadanie2 {

    public static void main(String[] args) {
        int tab[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < tab.length; i=i+2) {
            int generated = r.nextInt(1001);
            if (generated % 2 == 0) {
                tab[i] = generated;
        }else{
                i--;
            }

        for (int j = 0; j < tab.length;j++) {
            System.out.println("Wartosc na indeksie: " + j
                    + " : " + tab[j]);
        }
    }
}
}