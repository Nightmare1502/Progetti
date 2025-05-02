import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    // Definizione del record Fattura
    public record Fattura(int id, BigDecimal importoOriginale, BigDecimal importoScontato) {
        @Override
        public String toString() {
            return "Fattura #" + id +
                    " - Importo originale: €" + importoOriginale +
                    " - Importo scontato: €" + importoScontato;
        }
    }

    public static void main(String[] args) {
        // Creazione della lista di importi fatture
        List<BigDecimal> importiFatture = new ArrayList<>();
        importiFatture.add(new BigDecimal("750.50"));
        importiFatture.add(new BigDecimal("1200.00"));
        importiFatture.add(new BigDecimal("500.00"));
        importiFatture.add(new BigDecimal("2300.75"));
        importiFatture.add(new BigDecimal("980.25"));

        // Creazione della Map per salvare gli importi scontati
        List<Fattura> fatture = getFattura(importiFatture);

        // Stampa dei risultati
        System.out.println("Elenco delle fatture con sconti applicati:");
        for (Fattura fattura : fatture) {
            System.out.println(fattura);
            System.out.println("Sconto applicato: " +
                    (fattura.importoOriginale.compareTo(new BigDecimal("1000")) > 0 ? "10%" : "5%"));
            System.out.println("-----------------------------------------");
        }
    }

    private static List<Fattura> getFattura(List<BigDecimal> importiFatture) {
        Map<Integer, BigDecimal> importiScontati = new HashMap<>();

        // Applicazione dello sconto condizionale e popolazione della Map
        for (int i = 0; i < importiFatture.size(); i++) {
            BigDecimal importoOriginale = importiFatture.get(i);
            BigDecimal percentualeSconto = importoOriginale.compareTo(new BigDecimal("1000")) > 0 ?
                    new BigDecimal("0.10") : new BigDecimal("0.05");

            BigDecimal importoSconto = importoOriginale.multiply(percentualeSconto);
            BigDecimal importoScontato = importoOriginale.subtract(importoSconto).setScale(2, RoundingMode.HALF_UP);
            importiScontati.put(i, importoScontato);
        }

        // Creazione delle istanze di Fattura
        List<Fattura> fatture = new ArrayList<>();
        for (int i = 0; i < importiFatture.size(); i++) {
            Fattura fattura = new Fattura(i + 1, importiFatture.get(i), importiScontati.get(i));
            fatture.add(fattura);
        }
        return fatture;
    }
}