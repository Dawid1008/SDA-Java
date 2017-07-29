/**
 * Created by Dawid1008 on 2017-07-21.
 */

//Rzutowanie jest to zmiana typu zmiennej na inny typ zmiennej
public class Rzutowanie {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double c = 12;
        double d = 15;

        //Wynik dzielenia liczb całkowitych int
        System.out.println("Wynik dzielenia liczb całkowitych [int] (a / b): " + a / b);

        //Wynik dzielenia liczb całkowitych int po rzutowaniu (zamieniliśmu jedna wartość na na double)
        System.out.println("Wynik po rzutowaniu zmiennej z int na double ((double) a / b): " + (double) a / b);

        // Zmieniliśmy typ zmiennej double o nazwie "d" na zmienną int
        int wynik = a / (int)d;

        //Nie wymaga Rzutowania ponieważ gdy mamy zmienna o typie "double" to "int a" automatycznie jest zamieniany na double
        double wynik2 = a / d;

        System.out.println("Wynik dzielenia ziennej int / int (a / d) " + wynik);
        System.out.println("Wynik dzielenia ziennej int / double (a / d): " + wynik2);
        System.out.println("Wynik dzielenia ziennej int / int (1 / 5): " + 1 / 5);
        System.out.println("Wynik dzielenia ziennej double / int (1.0 / 5): " + 1.0 / 5);

    }
}
