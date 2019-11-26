package konmic_pojazdy;

import java.util.Scanner;

public abstract class Pojazdy {
    Scanner scan = new Scanner(System.in);
    int liczba_drzwi;
    int liczba_kol;
    String model;

    public Pojazdy(){
        System.out.println("Konstruktor nadklasy Pojazdy");
    }

    void info(){
            System.out.println("Podaj model BMW.");
            model = scan.next();
            System.out.println("Podaj liczbę drzwi w samochodzie.");
            liczba_drzwi = scan.nextInt();
            System.out.println("Podaj liczbę kół w samochodzie.");
            liczba_kol = scan.nextInt();
            System.out.println("Model samochodu: " + model);
            System.out.println("Liczba drzwi: " + liczba_drzwi);
            System.out.println("Liczba kół: " + liczba_kol);
    }

    abstract void auto();
}
