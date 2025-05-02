package org.example;

public class Main {
    public static void main(String[] args) { // creiamo le variabili di tipo int e le incrementiamo
        int num1 = 8;
        int num2 = 5;
        int num1x = num1 + 2; // 10
        int num2x = num2 + 1; // 6

        System.out.println("La moltiplicazione dei numeri incrementati è: " + moltiplicazione(num1x, num2x));

    } // creiamo un metodo per la moltiplicazione dei numeri incrementati
    public static int moltiplicazione(int c, int d){
        return c * d; // return per eseguire il calcolo
    }
}