/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171219;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ChristmasTree tree = new ChristmasTree();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość poziomów.");
        int levels = scan.nextInt();
        tree.setChristmasTree(levels);

    }

}
