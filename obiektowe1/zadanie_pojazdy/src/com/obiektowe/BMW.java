package com.obiektowe;

import java.util.Scanner;

public class BMW extends Pojazdy {

    void auto(){
        System.out.println("BMW");
    }

    public BMW(){
        System.out.println("Konstruktor podklasy BMW");
    }

    void info()
    {
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
}
