package org.example;

public class Main {
    public static void main(String[] args) {
        // chiamata al metodo
        calcolaCaratteri();
    }// creiamo il metodo e usiamo il for loop per
    // controllare quanti "a" ci sono nella stringa
    public static void calcolaCaratteri () {
        char[] caratteri = {'a', 'b', 'a', '0'};
        int aTotali = 0;
        for (int i = 0; i < 4; i++) {
            // eseguiamo un controllo if per identificare la "a"
            if (caratteri[i] == 'a'){
                aTotali++;
            }
        }// eseguiamo il risultato
        System.out.println(aTotali);
    }
}