/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obktpojazdy;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rower rower1 = new Rower();
       rower1.info();
       Motor motor1 = new Motor();
       motor1.info();
       Auto auto1 = new Auto();
       auto1.info();
       Autobus autobus1 = new Autobus();
       autobus1.info();
       Hulajnoga hulajnoga1 = new Hulajnoga();
       hulajnoga1.info();
    }
    
}
