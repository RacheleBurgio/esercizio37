package esercizio1;

public class Main {
    public static void main(String[] args) {

        // Test dei metodi fatti

        System.out.println(stringaPariDispari("ciao"));
        System.out.println(stringaPariDispari("hello"));
        System.out.println(annoBisestile(2024));
        System.out.println(annoBisestile(1900));
    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        }
        return anno % 4 == 0 && anno % 100 != 0;
    }
}