import java.util.Scanner;

/**
 * Created by Dawid1008 on 2017-07-16.
 */
public class zadanie_domowe_stiuu {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj statystyke");
        String statystyka = sc.nextLine();

        // do switch przekazujemy zmienną
        switch(statystyka){


            case "średnia": {
                System.out.println("Podaj n");
                int n = sc.nextInt();
                int suma = 0;
                for (int i = 0; i < n; i++) {
                    System.out.println("Podaj liczbe");
                    suma += sc.nextInt();
                }
                System.out.println("srednia = " + suma / n);
            }
            case "max":{
                System.out.println("Podaj n");
                int n = sc.nextInt();
                int liczba;
                int max = 0;
                for (int i = 0; i < n; i++) {
                    System.out.println("Podaj liczbe");
                    liczba = sc.nextInt();
                    if (liczba > max) {
                        max = liczba;
                    }
                }
                System.out.println("max = " + max);
            }
            case "min": {
                System.out.println("Podaj n");
                int n = sc.nextInt();
                int liczba;
                int min = 1000;
                for (int i = 0; i < n; i++) {
                    System.out.println("Podaj liczbe");
                    liczba = sc.nextInt();
                    if (liczba < min) {
                        min = liczba;
                    }
                }
                System.out.println("min = " + min);
            }
            default:{
                System.out.println("Brak takiej Statystyki");
            }
        }



    }
}
