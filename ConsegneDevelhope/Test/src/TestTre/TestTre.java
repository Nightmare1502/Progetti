package TestTre;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestTre {
    public static void main(String[] args) {

        OffsetDateTime dataSelezionata = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("La data selezionata è: " + dataSelezionata);

        String dataString = dataSelezionata.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data formattata: " + dataString);

    }
}