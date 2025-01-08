package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserire una stringa seguita dal tasto Invio (digita ':q' per uscire)");

        do {
            System.out.println("Inserire una stringa:");
            input = scanner.nextLine().trim();

            if (!input.isEmpty() && !input.equals(":q")) {
                String[] caratteri = input.split("");
                System.out.println("Caratteri separati: " + String.join(",", caratteri));
            } else if (input.isEmpty()) {
                System.out.println("Stringa vuota. Riprova.");
            }

        } while (!input.equals(":q"));

        scanner.close();
        System.out.println("Programma terminato.");
    }
}

