package konmic_pojazdy;

public class Skoda extends Pojazdy {

    void auto(){
        System.out.println("BMW");
    }

    public Skoda(){
        System.out.println("Konstruktor podklasy Skoda");
    }

    void info()
    {
        System.out.println("Skoda");
        System.out.println("Podaj model Skody.");
        model = scan.next();
        System.out.println("Podaj liczbę drzwi w samochodzie.");
        liczba_drzwi = scan.nextInt();
        System.out.println("Podaj liczbę kół w samochodzie.");
        liczba_kol = scan.nextInt();
        System.out.println("Model samochodu: " + model);
        System.out.println("Liczba drzwi: " + liczba_drzwi);
        System.out.println("Liczba kół: " + liczba_kol);
    }
}
