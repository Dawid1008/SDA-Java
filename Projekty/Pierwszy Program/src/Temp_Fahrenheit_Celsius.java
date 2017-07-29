import java.util.Scanner;

/**
 * Created by Dawid1008 on 2017-07-06.
 */
public class Temp_Fahrenheit_Celsius {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w stopniach Celsiusza");
        float temperaturawCelsiuszach = scanner.nextFloat();
        float temperatourawFahrenheitach = 1.8f * temperaturawCelsiuszach + 32;
        System.out.println(temperatourawFahrenheitach);
    }
}
