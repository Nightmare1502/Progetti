package TestUno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TestUnoTest {

    @Test
    public void testGiornoSettimanaValoriValidi() {
        // Test per tutti i giorni validi (1-7)
        assertEquals("Lunedì", TestUno.giornoSettimana(1));
        assertEquals("Martedì", TestUno.giornoSettimana(2));
        assertEquals("Mercoledì", TestUno.giornoSettimana(3));
        assertEquals("Giovedì", TestUno.giornoSettimana(4));
        assertEquals("Venerdì", TestUno.giornoSettimana(5));
        assertEquals("Sabato", TestUno.giornoSettimana(6));
        assertEquals("Domenica", TestUno.giornoSettimana(7));
    }

    @Test
    public void testGiornoSettimanaValoriNonValidi() {
        // Test per valori non validi
        assertEquals("Errore, valore non valido", TestUno.giornoSettimana(0));
        assertEquals("Errore, valore non valido", TestUno.giornoSettimana(8));
        assertEquals("Errore, valore non valido", TestUno.giornoSettimana(-1));
    }
}