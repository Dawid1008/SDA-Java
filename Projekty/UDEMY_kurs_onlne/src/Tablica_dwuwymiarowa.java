import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Dawid1008 on 2017-07-23.
 */
public class Tablica_dwuwymiarowa {
    public static void main (String[]args) {

        /*

            1      2      3
       | -------------------- |
     1 | [0][0] [0][1] [0][2] | <- wiersze
       | -------------------- |
     2 | [1][0] [1][1] [1][2] |
       | -------------------- |
     3 | [2][0] [2][1] [2][2] |
       | -------------------- |
                          ^^ kolumny

         */
        //  1 Sposób
        int[][] tablica = new int[3][3];

        tablica[0][0] = 10;
        tablica[2][2] = 90;

        System.out.println("Odwołanie do tablicy 1: " + tablica[0][0]);

        //2 Sposób
        int[][] tab2 =
                {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 50}
                };
        System.out.println("Odwołane do tab2: " + tab2[1][0]);

    }
}
// w 1 polu wpisujemy wiersze
// w 2 polu wpisujemy kolumny
