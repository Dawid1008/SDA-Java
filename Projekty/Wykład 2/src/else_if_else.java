import java.util.Scanner;

/**
 * Created by Dawid1008 on 2017-07-07.
 */
public class else_if_else {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę w kg");
        float waga = scanner.nextFloat();

        System.out.println("Podaj wysokość w metrach");
        float wzrost = scanner.nextFloat();

        float bmi = waga / (wzrost * wzrost);
        if(bmi<18.5){
            System.out.println("Masz niedowagę ");

        }else if(bmi>25){
            System.out.println("Masz nadwagę");

        }else {
            System.out.println("Jest OK");
        }

    }
}
