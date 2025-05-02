import java.math.BigDecimal;

public class Main {

    public enum Operazione {
        ADDIZIONE("+"),
        SOTTRAZIONE("-"),
        MOLTIPLICAZIONE("*"),
        DIVISIONE("/"),
        MIN("min"),
        MAX("max");

        private final String simbolo;

        Operazione(String simbolo) {
            this.simbolo = simbolo;
        }

        public String getSimbolo() {
            return simbolo;
        }
    }

    public static void main(String[] args) {
        // Impostazione dei due BigDecimal
        BigDecimal numero1 = new BigDecimal("100.50");
        BigDecimal numero2 = new BigDecimal("25.25");

        // Esegue tutte le operazioni disponibili
        for (Operazione op : Operazione.values()) {
            BigDecimal risultato = calcola(numero1, numero2, op);

            // Stampa il tipo di operazione, i dati di input e il risultato
            System.out.println("Operazione: " + op);
            System.out.println(numero1 + " " + op.getSimbolo() + " " + numero2 + " = " + risultato);
            System.out.println();
        }
    }

    public static BigDecimal calcola(BigDecimal a, BigDecimal b, Operazione op) {
        switch (op) {
            case ADDIZIONE: return a.add(b);
            case SOTTRAZIONE: return a.subtract(b);
            case MOLTIPLICAZIONE: return a.multiply(b);
            case DIVISIONE: return a.divide(b, 4, BigDecimal.ROUND_HALF_UP);
            case MIN: return a.min(b);
            case MAX: return a.max(b);
            default: throw new IllegalArgumentException("Operazione non supportata");
        }
    }
}