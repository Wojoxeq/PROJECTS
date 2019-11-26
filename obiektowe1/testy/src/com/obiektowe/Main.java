package com.obiektowe;

public class Main {

    public static void main(String args[]) {
        ciag_kwadratowy ciag=new ciag_kwadratowy();
        ciag.init(2);
        for(int i=0;i<3;i++){System.out.println(ciag.nastepny_element());} }}
    interface dane{
        int nastepny_element();
        void init(int i);
    }
    class ciag_kwadratowy implements dane{
        int wartosc;
        public int nastepny_element(){return wartosc=wartosc*wartosc;}
        public void init(int i){wartosc=i;}
    }