package org.example;
// creiamo le variabili e assegnamoli dei valori
public class Main {
    public static void main(String[] args) {
        char x = 'H';
        char y = 'L';
// stampiamo i valori
        System.out.print(x + ", ");
        System.out.println(y);
// eseguiamo gli operatori di comparazione
        boolean uguale = x == y;
        System.out.println(x + " è uguale a " + y + " - " + uguale);

        boolean diverso = x != y;
        System.out.println(x + " è diverso da " + y + " - " + diverso);
    }
}