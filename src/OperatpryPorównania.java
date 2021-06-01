import java.util.Scanner;

public class OperatpryPorównania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;

        System.out.println(result);
    }
}
