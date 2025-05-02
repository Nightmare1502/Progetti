package org.example;

public class Main {
    public static void calcolaSomma() {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // creiamo l'array direttamente
        int somma = 0;
        // eseguiamo il ciclo foreach
        for (int num : numeri) {
            somma += num;
        }
        // stampiamo il risultato
        System.out.println("La somma dei numeri è: " + somma);
    }
    // creiamo il metodo per il calcolo della somma dei valori dell'array
    public static void main(String[] args) {
        calcolaSomma();
    }
}