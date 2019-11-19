import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args){
        int tab[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
             tab[i] = r.nextInt(1001);
          
            }
        
        for (int i = 0; i < tab.length; i=i+2) {
            System.out.println("Wartosc na indeksie: " +i 
                    +" : "+ tab[i]);
        }
    }
}
