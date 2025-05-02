package TestDue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestDueTest {

    @Test
    public void testParseOffsetDateTime() {
        // Verifica che la stringa di data possa essere correttamente analizzata in OffsetDateTime
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        assertNotNull(data);
        assertEquals(2002, data.getYear());
        assertEquals(3, data.getMonthValue());
        assertEquals(1, data.getDayOfMonth());
        assertEquals(13, data.getHour());
    }

    @Test
    public void testShortFormatting() {
        // Verifica la formattazione short
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataShort = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        assertNotNull(dataShort);
        assertFalse(dataShort.isEmpty());
        assertTrue(dataShort.contains("02") || dataShort.contains("2002"));
    }
}