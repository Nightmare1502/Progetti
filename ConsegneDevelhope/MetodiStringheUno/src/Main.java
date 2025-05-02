public class Main {

    // creazione metodo per comparare le stringhe

    public static String compareStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        // usiamo if per la comparazione
        if (str1.equals(str2)) {
            result.append("Le due stringhe sono uguali");
        } else {
            result.append("Le due stringhe sono differenti");
        }
        // ritorniamo il valore della string builder
        return result.toString();
    }

    public static void main(String[] args) {
        // nel main aggiungiamo le stringhe da comparare
        String string1 = "Questa è la prima stringa";
        String string2 = "Questa invece è la seconda stringa";
        String string3 = "Questa è la prima stringa";
        // stampiamo il risultato della comparazione
        System.out.println(compareStrings(string1, string2));
        System.out.println(compareStrings(string1, string3));
    }
}
