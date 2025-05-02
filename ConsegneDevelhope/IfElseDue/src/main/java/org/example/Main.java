package org.example;

public class Main {
    public static void main(String[] args) {
        // creiamo la stringa con il contenuto
        String parola = "Parola";

        // eseguiamo il control flow
        if (lunghezzaString(parola) > 10) {
            maggiore();
        } else if (lunghezzaString(parola) < 10) {
            minore();
        } else {
            pari();
        }
    }

    // creiamo un metodo per calcolare la lunghezza della stringa
    public static int lunghezzaString(String str) {
        return str.length();
    }
    // creiamo i metodi per la stampa
    public static void maggiore() {
        System.out.println("Lunghezza maggiore di 10");
    }

    public static void minore() {
        System.out.println("Lunghezza minore di 10");
    }

    public static void pari() {
        System.out.println("Lunghezza pari a 10");
    }
}