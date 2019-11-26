/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obktpojazdy;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Auto extends Pojazd {
    
    public Auto() {
        System.out.println("Konstruktor podklasy Auto");
    }
    
    String typPaliwa;
    String typSilnika;
    
    Scanner scan = new Scanner(System.in);
    
    void info() {
        System.out.println("Podaj typ paliwa pojazdu.");
        typPaliwa = scan.next();
        System.out.println("Podaj typ silnika pojazdu.");
        typSilnika = scan.next();
        System.out.println("Typ paliwa: " + typPaliwa);
        System.out.println("Typ silnika: "+ typSilnika);
    }
    
    void pokaz() {
    }
}
