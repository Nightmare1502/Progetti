import java.time.OffsetDateTime;

public class DateTre {
    public static void main(String[] args) {

        OffsetDateTime dataEOra = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Data e ora selezionata: " + dataEOra);

        System.out.println("Anno: " + dataEOra.getYear());
        System.out.println("Mese: " + dataEOra.getMonth());
        System.out.println("Giorno del mese: " + dataEOra.getDayOfMonth());
        System.out.println("Giorno della settimana: " + dataEOra.getDayOfWeek());

    }
}