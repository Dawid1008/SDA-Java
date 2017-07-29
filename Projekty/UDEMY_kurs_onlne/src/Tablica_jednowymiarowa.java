/**
 * Created by Dawid1008 on 2017-07-23.
 */
public class Tablica_jednowymiarowa {
    public static void main(String[] args) {

        //zadeklarowanie tablicy 1 sposób
        //przypisujemy (rezerwujemy)do tablicy jak dużo chcemy przypisać liczb całkowitych
        int[] tablica;
        tablica = new int[5];

        tablica[0] = 10;
        tablica[1] = 15;
        tablica[2] = 30;
        tablica[3] = 50;
        tablica[4] = 99;

        System.out.println("tablica 1: " + tablica[0]);

        // lub mozemy to zapisac w jednej lini
        int[] tab2 = new int[5];

        tab2[0] = 1;
        tab2[1] = 2;
        tab2[2] = 3;

        System.out.println("tablica 2: " + tab2[2]);

        //deklaracja tablicy 2 sposób deklaracja (przypisanie) i inicjalizacja w jednej lini

        int[] tab3 = {4, 8, 12, 16, 20};

        // odwołujemy sie do tablicy

        System.out.println("tablica 3: " + tab3[4]);
        System.out.println("tablica 3: " + tab3.length);

    }
}
