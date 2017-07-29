package Instrukcje;

/**
 * Created by Dawid1008 on 2017-07-22.
 */
public class Wyrazenia_warunkowe {
    static public void main (String[]args){


        int a = 5;
//        if(a % 2 == 0){
//        System.out.println("Liczba jest parzysta");
//        } else {
//            System.out.println("liczba jest nie parzysta");




        //wyrażenie ? tu piszemy co ma sie stać jesi wyrazenie jest truee : a tu co ma sie stać jesli wyrazenie jest false
            String czyParzysta = a % 2 == 0 ? "parzysta" : "nieparysta";
            System.out.println(czyParzysta);
    }


    }
