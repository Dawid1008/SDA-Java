package Operatory;

/**
 * Created by Dawid1008 on 2017-07-21.
 */
public class Operatory_logiczne {
    public static void main (String[]args){

        /* OPERATORY Logiczne : true , false
         ! - negacja
         !(true) - false
         !(false) - true

         && - Koniunkcja - " I " w tym samym momenice (oba wyrażenia musza byc prawdziwe)

         true true = true
         true false = false
         false true = false
         false false = false

         || - Alternatywa - "LUB" to lub też to (jedno lub drugie wyrazenie musi byc prawdziwe)

         */

    int a = 5;
    int b = 5;
    int c = 9;


    if( a == b && c > b)
        System.out.println("tak");
    }
}
