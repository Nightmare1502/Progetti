package TestTre;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class TestTreTest {

    @Test
    public void testDate() {
        // Crea e formatta la data
        OffsetDateTime dataSelezionata = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataString = dataSelezionata.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        // Verifica che la stringa non sia null
        assertNotNull(dataString);

        // Verifica che la stringa contenga il nome del mese in italiano
        assertTrue(dataString.contains("marzo"), "La data dovrebbe contenere il nome del mese in italiano");

        // Verifica il formato completo
        assertEquals("01 marzo 2023", dataString, "Il formato della data dovrebbe essere 'dd MMMM yyyy' in locale italiano");
    }
}