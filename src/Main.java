import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double number2 = scanner.nextDouble();
        double result = number1 * number2;
        System.out.println("wunik mnożenia to: " + result);
        System.out.printf("Wynik mnożenia liczby %f i liczby %f to: %.2f\n", number1, number2, result);
        System.out.println("wynik mnożenia liczby " + number1 + "i liczby " + number2 + "to: " + result);
        System.out.println(2>3);
        String str = "kocham bazy danych";
        Boolean isTrue = true;
        double potega = number1 *number1;
        System.out.printf("Tekst to: %S - to jest: %b. liczba %f podniesiona do potęgi 2 wynosi %f.", str, isTrue, number1, potega);

    }
}