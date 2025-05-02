import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateQuattro {

    public static void main(String[] args) {

        OffsetDateTime dataEOra = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date e ora selezionata: " + dataEOra);

        OffsetDateTime dataAggiornata = dataEOra.plusYears(1).minusMonths(1).plusDays(7);
        String dataOraFormat = dataAggiornata.format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", Locale.ITALY));
        System.out.println("Data aggiornata: " + dataOraFormat);

    }
}
