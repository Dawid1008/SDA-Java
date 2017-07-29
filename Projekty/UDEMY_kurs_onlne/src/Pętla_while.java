import java.util.Scanner;

/**
 * Created by Dawid1008 on 2017-07-27.
 */
public class Pętla_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int[] liczbyCałkowite =

                {
                        10,
                        20,
                        30,
                        40,
                        50,
                        60,
                        70,
                        80,
                        90,
                        100,
                };
        int i = 0;

        while (i < 10) {

            System.out.println(liczbyCałkowite[i]);
            i++;
        }
    }
}