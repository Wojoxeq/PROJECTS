/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

/**
 *
 * @author user
 */
public class Dane {

    private String imie;
    private String nazwisko;
    private String adres;
    private String telefon;

    private Dane(){}
    
    public Dane(String imie, String nazwisko, String adres, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.telefon = telefon;
        System.out.println("imie=" + imie + ", nazwisko=" + nazwisko + ", adres=" + adres + ", telefon=" + telefon);
    }

    @Override
    public String toString() {
        return "Dane{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", adres=" + adres + ", telefon=" + telefon + '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}

