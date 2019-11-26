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
public class Hulajnoga extends Pojazd{
    
    public Hulajnoga() {
        System.out.println("Konstruktor podklasy Hulajnoga");
    }
    
    String rodzaj;
    
    Scanner scan = new Scanner(System.in);
    
    void info() {
        System.out.println("Podaj rodzaj hulajnogi.");
        rodzaj = scan.next();
        System.out.println("Rodzaj hulajnogi: " + rodzaj);
    }
    
    
    void pokaz() {
    }
}
