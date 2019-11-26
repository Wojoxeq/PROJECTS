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
public class Autobus extends Auto {
    
    public Autobus() {
        System.out.println("Konstruktor podklasy Autobus");
    }
    
    int pojemnoscBaku;
    
    Scanner scan = new Scanner(System.in);
    
    void info() {
        System.out.println("Podaj pojemność baku.");
        pojemnoscBaku = scan.nextInt();
        System.out.println("Pojemność baku: " + pojemnoscBaku+ "L");
    }
    
    void pokaz() {
    }
}
