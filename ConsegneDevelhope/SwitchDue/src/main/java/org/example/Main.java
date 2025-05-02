package org.example;

public class Main {
    public static void main(String[] args) {
        // immettiamo un numero che rappresenta un giorno della settimana
        char operazione = '*';

        // Chiamiamo il metodo che restituisce il nome del giorno
        String tipoOperazione = simbolo(operazione);

        // Stampiamo il risultato
        System.out.println(tipoOperazione);
    }

    // Metodo che restituisce il nome del giorno della settimana
    // o un messaggio di errore se il numero non è valido
    public static String simbolo(char simbolo) {
        switch (simbolo) {
            case '*':
                return "Moltiplicazione";
            case '/':
                return "Divisione";
            case '+':
                return "Addizione";
            case '-':
                return "Sottrazione";
            default:
                return "Tipo di operazione non identificato";
        }
    }
}
