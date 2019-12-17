/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171219;

import java.util.Random;

/**
 *
 * @author user
 */
public class ChristmasTree {

    public void setChristmasTree(int levels) {
	String[] bubles = {"@", "O", "o", "*", "*", "*"};
	int f, a;

	for (int i = 0; i < levels; i++) {
	    for (a = 0; a < levels * 2; a++) {
		if (a < (levels - i) || a > (levels + i)) {
		    System.out.print(" ");
		} else {

		    Random rnd = new Random();
		    f = rnd.nextInt(5);

		    System.out.print(bubles[f]);
		}
	    }
	    System.out.println();
	}
    }
}
