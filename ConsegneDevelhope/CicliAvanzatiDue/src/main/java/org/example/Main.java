package org.example;

public class Main {
    public static void main(String[] args) {
        printNumbers(10); //chiamata al metodo
    }

    public static void printNumbers(int maxValue) {
        for (int x = 0; x <= maxValue; x++) { //creiamo il ciclo for
            if (x == 5) {
                continue;
            }
            System.out.println(x); //facciamo stampare il risultato
        }
    }
}