import java.util.Scanner;

public class AufgabeB {
    public static void main(String[] args) {
        // Scanner-Objekt erstellen
        Scanner sc = new Scanner(System.in);

        // Zeilen einlesen
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();

        // Eingelesene Zeilen in Kleinbuchstaben konvertieren
        line1 = line1.toLowerCase();
        line2 = line2.toLowerCase();
        line3 = line3.toLowerCase();

        String separator = args[0];

        // Zeichenketten verketten
        String result = line1 + separator + line2 + separator + line3;

        // Ergebnis ausgeben
        System.out.println(result);

        // Scanner schließen
        sc.close();
    }
}
