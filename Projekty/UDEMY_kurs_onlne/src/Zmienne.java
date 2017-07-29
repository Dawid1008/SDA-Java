/**
 * Created by Dawid1008 on 2017-07-20.
 */
public class Zmienne {
    public static void main(String[] args) {

        //" int, float, double, String " Typ Zmiennej
        //" a, b, c, imie, nazwisko " Nazwa Zmiennej
        //" = " Opertaor (Znaki typu = > < itp)
        // Deklaracja Zmiennych => typ prymitywny
        int a = 7;
        int b = 20;
        int c;
        c = a + b;
        String imie = "Dawid";
        String nazwisko = "Lukasik";
        float srednia = 3.5f;
        double dokladniejszaSrednia = 3.567890;

        String daneOsobowe = (imie + " " + nazwisko);

        // Odwolujemy sie teraz do funkcji czyli zwracamy to co zadeklarowalismy
        System.out.println(c);
        System.out.println("Imie: " + imie + "  " + "Nazwisko: " + nazwisko);
        System.out.println("Srednia" + " " + srednia);
        System.out.println("Dokladniejsza Srednia" + " " + dokladniejszaSrednia);
        System.out.println(daneOsobowe);
    }
}
//ZMIENNA jest to pojemnik do której moge zapisac jakas wartosc.
//INICJALIZACJA jet to przypisanie danej wartości do nazwy zmiennej.