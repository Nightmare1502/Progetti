import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

// Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

public class Main {
    public static void main(String[] args) {

        // creazione oggetto HashMap inizializzando attraverso un costruttore
        HashMap<String, String> cittaCapitali = new HashMap<>();

        // aggiungiamo le chiavi e i valori
        cittaCapitali.put("Roma", "Italia");
        cittaCapitali.put("Londra", "Inghilterra");
        cittaCapitali.put("Madrid", "Spagna");

        System.out.println("Città capitali: " + cittaCapitali);

        // inizializzazione con Map.of(), creando un'istanza di una mappa immutabile
        Map<String, String> provincia = Map.of("FE", "Ferrara", "RM", "Roma");

        System.out.println("\nProvincia: " + provincia);

        // inizializzazione con Map.ofEntries()
        Map<String, Integer> studenti = (Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Enrico", 25),
                new AbstractMap.SimpleEntry<>("Anna", 23)));

        System.out.println("\nLista studenti: " + studenti);

    }
}