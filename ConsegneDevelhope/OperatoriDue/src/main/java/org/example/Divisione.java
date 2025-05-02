package org.example;

public class Divisione {
    public static void main(String[] args) { // creiamo le variabili di tipo int, assegniamo il valore e prepariamo la stampa
        int num1 = 10;
        int num2 = 5;

        System.out.println("Il risultato della divisione è: " + divisione(num1, num2));
    }
// creiamo il metodo int divisione per dividere il valore delle due variabili
    public static int divisione(int a, int b) {
        return a / b; // eseguiamo la divisione
    }
}
