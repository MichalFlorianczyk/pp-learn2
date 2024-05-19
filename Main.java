import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę nr 1:");
        double a = scanner.nextDouble();

        System.out.println("Podaj liczbę nr 2:");
        double b = scanner.nextDouble();

        System.out.println("Podaj liczbę nr 3:");
        double c = scanner.nextDouble();

        // oblicze delte
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            System.out.println("Równanie ma dwa rozwiązania");
        }

        if (delta == 0) {
            System.out.println("Równanie ma jedno rozwiązanie");
        }

        if (delta < 0) {
            System.out.println("Równanie nie ma rozwiązań");
        }
        scanner.close();
    }
}
