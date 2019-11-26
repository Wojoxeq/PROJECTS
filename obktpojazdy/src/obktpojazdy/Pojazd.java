/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obktpojazdy;

import java.util.Scanner;

public abstract class Pojazd {
    
    public Pojazd() {
        System.out.println("Konstruktor nadklasy Pojazd");
    }
    
    String marka;
    String model;
    Scanner scan = new Scanner(System.in);
    
    abstract void pokaz();
}
