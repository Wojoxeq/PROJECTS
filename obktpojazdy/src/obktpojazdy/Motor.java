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
public class Motor extends Pojazd{
    
    public Motor() {
        System.out.println("Konstruktor podklasy Motor");
    }
    
    String marka;
    String typSilnika;
    
    Scanner scan = new Scanner(System.in);
    
    void info() {
        System.out.println("Podaj markę motoru.");
        marka = scan.next();
        System.out.println("Podaj typ silnika.");
        typSilnika = scan.next();
        System.out.println("Marka motoru: " + marka);
        System.out.println("Typ silnika: "+ typSilnika);
    }
    
    void pokaz() {
    }
}
