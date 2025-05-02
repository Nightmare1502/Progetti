package org.example;

public class AsciiSomma {
    public static void main(String[] args) { // creiamo variabili di tipo char e stampiamo il messaggio
        char char1 = 'r';
        char char2 = 'G';

        System.out.println("La somma dei valori ASCII è: " + sommaAscii(char1, char2));
    }

    public static int sommaAscii(char c1, char c2) {
        return c1 + c2; // usiamo return per fare la somma dei valori ASCII dei caratteri
    }
}
