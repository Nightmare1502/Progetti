package org.example;

public class Main {
    // Metodo per verificare se un numero è pari
    public static boolean isPari(int numero) {
        return numero % 2 == 0;
    }

    // Metodo per verificare se un numero è dispari
    public static boolean isDispari(int numero) {
        return numero % 2 != 0;
    }

    public static void main(String[] args) {
        int numero = 9; // Esempio di numero da controllare
// eseguiamo i control flow e la stampa
        if (isPari(numero)) {
            System.out.println("Il numero " + numero + " è pari.");
        } else if (isDispari(numero)) {
            System.out.println("Il numero " + numero + " è dispari.");
        }
    }
}
