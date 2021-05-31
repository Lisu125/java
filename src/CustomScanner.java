import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");
    }
}
