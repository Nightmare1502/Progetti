package TestCinque;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static TestCinque.TestCinque.dataOraFormat;
import static org.junit.jupiter.api.Assertions.*;

class TestCinqueTest {

    @Test
    public void testManipolazioneData() {
        OffsetDateTime dataEOra = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String annoVecchio = String.valueOf(dataEOra.getYear());
        String mese = String.valueOf(dataEOra.getMonth());

        assertNotNull(dataEOra);
        assertTrue(annoVecchio.contains("2023"));
        assertTrue(mese.contains("MARCH"));

        OffsetDateTime dataAggiornata = dataEOra.plusYears(1).minusMonths(1).plusDays(7);
        String annoPlus = String.valueOf(dataAggiornata.getYear());
        String meseMinus = String.valueOf(dataAggiornata.getMonth());
        int giornoDelMese = dataAggiornata.getDayOfMonth();

        assertNotNull(dataAggiornata);
        assertTrue(annoPlus.contains("2024"), "L'anno dovrebbe essere il 2024");
        assertTrue(meseMinus.contains("FEBRUARY") || meseMinus.contains("02"), "Il mese dovrebbe essere Febbraio");
        assertEquals(8, giornoDelMese, "Il giorno dovrebbe essere l'8");
    }

    @Test
    void dataAggiornata() {
        OffsetDateTime dataIniziale = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int annoAtteso = dataIniziale.getYear() + 1;

        // Act
        OffsetDateTime risultato = TestCinque.dataAggiornata(dataIniziale);

        // Assert
        assertEquals(annoAtteso, risultato.getYear(),
                "L'anno dovrebbe essere incrementato di 1");


    }
}