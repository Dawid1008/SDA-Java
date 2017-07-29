package Instrukcje;

/**
 * Created by Dawid1008 on 2017-07-22.
 */
public class Instrukcje_warunkowe {
    public static void main(String[] args) {
/*
        Instrukcja WARUNKOWA - czyli ROZKAZ do sprawadzenia czy coś jest prawdziwe lub fałszywe
        if(wyrażenie)
            instrukcja;
        else
            instrukcja;
 */

        int a = 7;
        int b = 7;

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");

        } else {
            System.out.println("a = b");
        }
    }


}

