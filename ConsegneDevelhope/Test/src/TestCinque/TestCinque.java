package TestCinque;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestCinque {

    public static void main(String[] args) {
        OffsetDateTime dataEOra = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Chiamata al metodo dataAggiornata
        OffsetDateTime dataModificata = dataAggiornata(dataEOra);

        // Chiamata al metodo dataOraFormat
        String dataFormattata = dataOraFormat(dataEOra);

        // Stampa dei risultati
        System.out.println("Data originale: " + dataEOra);
        System.out.println("Data aggiornata: " + dataModificata);
        System.out.println("Data formattata: " + dataFormattata);
    }

    public static OffsetDateTime dataAggiornata(OffsetDateTime dataEOra) {
        return dataEOra.plusYears(1).minusMonths(1).plusDays(7);
    }

    public static String dataOraFormat(OffsetDateTime dataEOra) {
        return dataAggiornata(dataEOra).format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", Locale.ITALY));
    }
}