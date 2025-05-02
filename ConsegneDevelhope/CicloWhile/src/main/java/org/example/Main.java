package org.example;

public class Main {
    public static void main(String[] args) {
        // creiamo le variabili e assegniamo un valore
        int numero = 0;
        int limite = 10;
        // iniziamo il ciclo while indicando la variabile numero che si debba incrementare
        // fino a raggiungere un valore più piccolo della variabile limite
        while (numero < limite) {
            numero++;
            System.out.println("1 + " + numero + " = " + somma(numero));
        }
    }
    // nuovo metodo per il calcolo della somma
    public static int somma(int numero) {
        return 1 + numero;
    }
}