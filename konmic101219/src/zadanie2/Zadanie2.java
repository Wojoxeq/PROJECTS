/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wiek1;
        int wiek2;

        System.out.println("Podaj wiek pierwszej osoby: ");
        wiek1 = scan.nextInt();

        System.out.println("Podaj wiek drugiej osoby: ");
        wiek2 = scan.nextInt();

        if (wiek1 > wiek2) {
            System.out.println("Pierwsza osoba jest starsza!");
        } else if (wiek2 > wiek1) {
            System.out.println("Druga osoba jest starsza!");
        }

    }

}
