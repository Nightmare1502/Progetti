public class Main {
    public static double divisione(Integer numeratore, Integer denominatore) throws IllegalArgumentException {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("Numeratore e denominatore non possono essere null");
        }
        if (denominatore == 0) {
            throw new IllegalArgumentException("il denominatore è uguale a zero");
        }
        return (double) numeratore / denominatore;
    }

    public static void main(String[] args) {
        try {
            double risultato = divisione(10, 2);
            System.out.println("risultato della divisione: " + risultato);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("errore: " + e.getMessage());
        }
        try {
            double risultato = divisione(5, null);
            System.out.println("risultato della divisione: " + risultato);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("operazione critica: " + e.getMessage());
        }
    }
}