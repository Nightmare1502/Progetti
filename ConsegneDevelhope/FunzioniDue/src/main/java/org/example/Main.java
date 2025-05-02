package org.example;

public class Main {
    public static void main(String[] args) {
// creiamo la stringa e eseguiamo la stampa
        String parola = "Parola";

        System.out.println("La lunghezza della stringa è di " + lunghezzaString(parola) + " caratteri");
    }
    // creiamo un metodo per calcolare la lunghezza della stringa
    public static int lunghezzaString (String str) {

        return str.length();
    }
}