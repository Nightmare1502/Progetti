package TestQuattro;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TestQuattroTest {

    @Test
    public void testDate() {

        OffsetDateTime dataEOra = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String giornoSettimana = String.valueOf(dataEOra.getDayOfWeek());
        String mese = String.valueOf(dataEOra.getMonth());

        assertNotNull(dataEOra);

        assertEquals(2023, dataEOra.getYear(), "L'anno dovrebbe essere 2023");
        assertEquals(3, dataEOra.getMonthValue(), "Il mese dovrebbe essere 3 (marzo)");
        assertEquals(1, dataEOra.getDayOfMonth(), "Il giorno dovrebbe essere l'1");
        assertEquals(13, dataEOra.getHour(), "L'ora dovrebbe essere 13");

        assertTrue(giornoSettimana.contains("WEDNESDAY"));
        assertTrue(mese.contains("MARCH"));

    }
}