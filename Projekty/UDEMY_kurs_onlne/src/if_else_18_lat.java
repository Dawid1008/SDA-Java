import java.util.Scanner;

/**
 * Created by Dawid1008 on 2017-07-23.
 */
public class if_else_18_lat {
    public static void main (String[]args){
        System.out.println("Podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();

        if(wiek >= 18){
            System.out.println("Masz 18 Lat");

        } else {
            System.out.println("Nie masz 18 Lat");
        }


    }
}
