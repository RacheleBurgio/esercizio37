package esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire un numero intero positivo seguito dal tasto Invio:");

        if (scan.hasNextInt()) {
            int test = scan.nextInt();
            if (test >= 0) {
                countdown(test);
            } else {
                System.out.println("Il numero inserito è negativo. Non è possibile eseguire il conto alla rovescia.");
            }
        } else {
            System.out.println("Input non valido. Inserire un numero intero positivo.");
        }

        scan.close();
    }

    public static void countdown(int num) {
        System.out.println("Conto alla rovescia da " + num + " a 0:");

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Fine del conto alla rovescia!");
    }
}