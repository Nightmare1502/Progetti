package org.example;

public class Media {
    public static void main(String[] args) { // creiamo le variabili di tipo int, assegniamo il valore e prepariamo la stampa
        int num1 = 10;
        int num2 = 7;
        int num3 = 13;

        System.out.println("La media dei numeri è: " + media(num1, num2, num3));
    }
    // creiamo il metodo int media per calcolare la media dei 3 numeri
    public static int media(int a, int b, int c) {
        return (a + b + c) / 3; // eseguiamo il calcolo
    }
}
