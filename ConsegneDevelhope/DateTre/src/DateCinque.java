import java.time.OffsetDateTime;

public class DateCinque {
    // Definire data1 e data2 come campi della classe
    private static OffsetDateTime data1;
    private static OffsetDateTime data2;

    public static void main(String[] args) {
        data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        DateCinque dateCinque = new DateCinque();

        boolean risultato1 = dateCinque.primaDataPrecedente();
        boolean risultato2 = dateCinque.secondaDataSuccessiva();
        boolean risultato3 = dateCinque.oreUguali();

        // Stampiamo i risultati
        System.out.println("Prima data precedente alla seconda? " + risultato1);
        System.out.println("Seconda data successiva alla prima? " + risultato2);
        System.out.println("Le ore sono uguali? " + risultato3);

    }

    public boolean primaDataPrecedente() {
        return data1.isBefore(data2);
    }

    public boolean secondaDataSuccessiva() {
        return data2.isAfter(data1);
    }
    public boolean oreUguali() {
        return data1.getHour() == data2.getHour();
    }

}