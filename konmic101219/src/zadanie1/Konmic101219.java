/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Konmic101219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String imie;
        String nazwisko;
        String adres;
        String telefon;
        while (true) {
            try {
                System.out.println("Wprowadź imię: ");
                imie = scan.nextLine();
                if (!Pattern.matches("^(?=.{1,40}$)[a-zA-Z]+(?:[-'\\s][a-zA-Z]+)*$",imie)) {
                    throw new InputMismatchException();
                }
                System.out.println("Wprowadź nazwisko: ");
                nazwisko = scan.nextLine();
                if (!Pattern.matches("^(?=.{1,40}$)[a-zA-Z]+(?:[-'\\s][a-zA-Z]+)*$", nazwisko)) {
                    throw new InputMismatchException();
                }
                System.out.println("Wprowadź adres: ");
                adres = scan.nextLine();
                if (!Pattern.matches("^([\\w\\s\\W]+[\\w\\W]?)\\s([\\d\\-\\\\\\/\\w]*)?", adres)) {
                    throw new InputMismatchException();
                }
                System.out.println("Wprowadź nr telefonu (+xx xxx-xxx-xxx): ");
                telefon = scan.nextLine();
                if (!Pattern.matches("^[+][0-9]{2,3}\\s{1}[0-9]{3}-[0-9]{3}-[0-9]{3}$", telefon)) {
                    throw new InputMismatchException();
                }

                System.out.println("Imię: " + imie);
                System.out.println("Nazwisko: " + nazwisko);
                System.out.println("Adres: " + adres);
                System.out.println("Telefon: " + telefon);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Zły format!");
            }
        }
    }

}
