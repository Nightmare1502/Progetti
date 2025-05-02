package org.example;

public class Main {
    public static void main(String[] args) {
// creiamo le variabili di tipo int e creiamo il messaggio da stampare
        int x = 20;
        int y = 40;

        System.out.println("La somma è: " + somma(x,y));
    }
    // creiamo il nuovo metodo somma e usiamo il comando return per l'addizione
    public static int somma (int x, int y){
        return x + y;
    }
}