package Instrukcje;

/**
 * Created by Dawid1008 on 2017-07-22.
 */

//SWITCH - przelacznik

public class Instrukcja_warunkowa_switch {
    public static void main(String[] args) {

        int a = 50;

        switch(a){
            case 50:
                System.out.println("a jest = 50");
                break;
            case 100:
                System.out.println("a jest = 100");
                break;
                default:
                    System.out.println("a nie jest = 50 ani 100");

            }
        }
    }
