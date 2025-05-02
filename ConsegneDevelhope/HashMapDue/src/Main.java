import java.util.*;

// Creare un hashmap, prendere tutti i valori, ordinarli e stamparli

public class Main {
    public static void main(String[] args) {

        // creazione oggetto HashMap inizializzando attraverso un costruttore
        HashMap<String, String> cittaCapitali = new HashMap<>();

        // aggiungiamo le chiavi e i valori
        cittaCapitali.put("Roma", "Italia");
        cittaCapitali.put("Londra", "Inghilterra");
        cittaCapitali.put("Madrid", "Spagna");
        cittaCapitali.put("Canberra", "Australia");
        cittaCapitali.put("Bruxelles", "Belgio");

        System.out.println("Lista capitali e il loro paese: " + cittaCapitali + "\n");

        // ordiniamo la HashMap cittaCapitali implementando una TreeMap (ordina le chiavi)
        TreeMap<String, String> cittaOrdinate = new TreeMap<>(cittaCapitali);

        for (Map.Entry<String, String> entry : cittaOrdinate.entrySet()) {
            System.out.println("Città ordinate: " + entry.getKey() + " -> " + entry.getValue());
        }

        // ordiniamo la HashMap in ordine alfabetico per la nazione (valore)

        // inizialmente convertiamo l'HashMap in List
        List<Map.Entry<String, String>> nazioniOrdinate = new ArrayList<>(cittaCapitali.entrySet());

        // ordiniamo i valori
        nazioniOrdinate.sort(Map.Entry.comparingByValue());

        // convertiamo in linked hash map per mantenere l'ordine e non perdere la struttura della mappa e le sue funzionalità
        LinkedHashMap<String, String> nazioniOrd = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : nazioniOrdinate) {
            nazioniOrd.put(entry.getKey(), entry.getValue());
        }

        // stampiamo le nazioni ordinate
        for (Map.Entry<String, String> entry : nazioniOrd.entrySet()) {
            System.out.println("Nazioni ordinate: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}