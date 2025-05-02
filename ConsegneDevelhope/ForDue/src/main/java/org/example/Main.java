package org.example;

public class Main {

    public static void main(String[] args) {
        int start = 8;        // Punto di partenza
        int maxResults = 3;   // Numero massimo di risultati

        // Ciclo for per stampare i numeri in ordine inverso
        for (int i = 0; i < maxResults; i++) {
            System.out.print((start - i) + " ");
        }
    }
}
