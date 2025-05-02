package org.example;

public class Main {
    public static void main(String[] args) {
        // creiamo la variabile e gli diamo un valore
        int numero = 15;

        // creiamo il metodo fizzBuzz per il numero dichiarato
        fizzBuzz(numero);
    }

    // creiamo il metodo che stampa "Fizz" per i multipli di 3, "Buzz" per i
    // multipli di 5 e "FizzBuzz" per i multipli di entrambi
    public static void fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
