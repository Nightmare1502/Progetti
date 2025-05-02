package org.example;

public class Casting {
    public static void main(String[] args) {
        // creiamo le variabili di tipo double e gli diamo un valore con le virgole
        double x = 10.3;
        double y = 15.7;
        // creiamo la variabili somma e applichiamo l'addizione tra le variabili x e y
        // il risultato lo trasformiamo in int usando il casting e stampiamo il risultato
        int somma = (int) (x + y);
        System.out.println(somma);
    }
}