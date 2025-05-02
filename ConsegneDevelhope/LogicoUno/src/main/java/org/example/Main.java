package org.example;
// creiamo le variabili e assegnamo dei valori
public class Main {
    public static void main(String[] args) {
        int limiteInferiore = 10;
        int limiteSuperiore = 30;
        int valoreConfronto = 20;
// eseguiamo gli operatori logici e stampiamo i valori
        boolean xOR = (valoreConfronto < limiteSuperiore) && (valoreConfronto > limiteInferiore);
        System.out.print(xOR);
    }
}