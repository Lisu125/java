import java.util.Scanner;

public class PracaD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();
        if (wiek < 18){
            System.out.println("Nie możesz kupić alkocholu szczeniaku");
        }else {
            System.out.println("Dziękuję za zakupy");
        }
    }
}
