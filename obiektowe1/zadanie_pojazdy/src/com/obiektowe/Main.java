package com.obiektowe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.info();
        Honda honda = new Honda();
        honda.info();
        Skoda skoda = new Skoda();
        skoda.info();
        Opel opel = new Opel();
        opel.info();
    }
}
