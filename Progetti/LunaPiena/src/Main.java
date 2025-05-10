import java.time.OffsetDateTime;

/**
 * Scrivi un programma che, dato un OffsetDateTime rappresentante una data futura,
 * calcoli la fase lunare approssimativa per quella data basandosi su un ciclo di
 * 29,53 giorni, considerando la data di nuova luna conosciuta (es. 2023-01-06).
 */

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dataLunaNuova = OffsetDateTime.parse("2025-03-29T00:00:00.000Z");

        while (true) {
            dataLunaNuova =
                    dataLunaNuova.plusDays(2).plusHours(12).plusMinutes(43).plusSeconds(12);

            OffsetDateTime dataLunaPiena =
                    dataLunaNuova.plusDays(14).plusHours(18).plusMinutes(14).plusSeconds(24);

            if (dataLunaNuova.getYear() > 2025)
                break;

            System.out.println("LUNA NUOVA " + dataLunaNuova);
            System.out.println("LUNA PIENA " + dataLunaPiena);
        }

    }
}