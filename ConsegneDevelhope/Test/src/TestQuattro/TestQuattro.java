/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */

package TestQuattro;

import java.time.OffsetDateTime;

public class TestQuattro {
    public static void main(String[] args) {

        OffsetDateTime dataEOra = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Data e ora selezionata: " + dataEOra);

        System.out.println("Anno: " + dataEOra.getYear());
        System.out.println("Mese: " + dataEOra.getMonth());
        System.out.println("Giorno del mese: " + dataEOra.getDayOfMonth());
        System.out.println("Giorno della settimana: " + dataEOra.getDayOfWeek());

    }
}