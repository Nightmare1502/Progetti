package TestUno;

public class TestUno {
    public static void main(String[] args) {
        // immettiamo un numero che rappresenta un giorno della settimana
        int giorno = 3;

        // Chiamiamo il metodo che restituisce il nome del giorno
        String nomeGiorno = giornoSettimana(giorno);

        // Stampiamo il risultato
        System.out.println(nomeGiorno);
    }

    // Metodo che restituisce il nome del giorno della settimana
    // o un messaggio di errore se il numero non è valido

    public static String giornoSettimana(int giorno) {
        switch (giorno) {
            case 1:
                return "Lunedì";
            case 2:
                return "Martedì";
            case 3:
                return "Mercoledì";
            case 4:
                return "Giovedì";
            case 5:
                return "Venerdì";
            case 6:
                return "Sabato";
            case 7:
                return "Domenica";
            default:
                return "Errore, valore non valido";
        }
    }
}
