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
public class Rower extends Pojazd{
    
    public Rower() {
        System.out.println("Konstruktor podklasy Rower");
    }
    
    
    int ilPrz;
    String typRoweru;
    
    Scanner scan = new Scanner(System.in);

    void info() {
        System.out.println("Podaj ilość przrzutek.");
        ilPrz = scan.nextInt();
        System.out.println("Podaj typ roweru.");
        typRoweru = scan.next();
        System.out.println("Ilość przerzutek: " + ilPrz);
        System.out.println("Typ roweru: " + typRoweru);
    }
    
    void pokaz() {
    }
    
}
