import java.util.Scanner;

public class PracaD1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podaj drugą liczbę: ");
        float secondNumber = scanner.nextFloat();

        float dodawanie = firstNumber + secondNumber;
        float odejmowanie = firstNumber - secondNumber;
        float mnożenie = firstNumber * secondNumber;
        float dzielenie = firstNumber / secondNumber;

        System.out.println("Wynik dodawania liczby " + firstNumber + " oraz " + secondNumber + " to " + dodawanie);
        System.out.println("Wynik odejmowania liczby " + firstNumber + " oraz " + secondNumber + " to " + odejmowanie);
        System.out.println("Wynik mnożenia liczby " + firstNumber + " oraz " + secondNumber + " to " + mnożenie);
        System.out.println("Wynik dzielenia liczby " + firstNumber + " oraz " + secondNumber + " to " + dzielenie);

    }
}
