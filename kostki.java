import java.util.Random;
import java.util.Scanner;

public class kostki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wybor = "T";

        do {
            System.out.print("Podaj liczbę kostek (3-10): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Błąd: podaj liczbę!");
                scanner.next();
            }

            int n = scanner.nextInt();

            if (n < 3 || n > 10) {
                System.out.println("Błąd: zakres 3-10");
                continue;
            }

            int[] wyniki = losujKostki(n);

            System.out.println("Wylosowane wyniki:");
            wypiszTablice(wyniki);

            int punkty = liczPunkty(wyniki);

            System.out.println("\nSuma punktów: " + punkty);

            System.out.println("\nCzy chcesz zagrać ponownie? (T/N)");
            wybor = scanner.next();

        } while (wybor.equalsIgnoreCase("T"));

        System.out.println("Koniec gry.");
    }

    public static int[] losujKostki(int n) {
        Random rand = new Random();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt(6) + 1;
        }

        return tab;
    }

    public static void wypiszTablice(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static int liczPunkty(int[] tab) {
        int[] licznik = new int[7];
        int suma = 0;

        for (int i = 0; i < tab.length; i++) {
            licznik[tab[i]]++;
        }

        for (int i = 1; i <= 6; i++) {
            if (licznik[i] >= 2) {
                suma += licznik[i] * i;
            }
        }

        return suma;
    }
}