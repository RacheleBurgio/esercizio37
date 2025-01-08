package esercizio2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3:");

        if (scan.hasNextInt()) {
            int test = scan.nextInt();
            System.out.println(stampaNumero(test));
        } else {
            System.out.println("Input non valido. Inserisci un numero intero.");
        }

        scan.close();
    }

    public static String stampaNumero(int num) {
        String risultato = switch (num) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "Numero fuori dall'intervallo 0-3.";
        };
        return risultato;
    }
}
