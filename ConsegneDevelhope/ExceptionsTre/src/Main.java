public class Main {
    public static void divisione(int a, int b) {
        try {
            int risultato = a / b; // Divisione per 0 genererà un'eccezione
            System.out.println("Risultato: " + risultato);
        } catch (ArithmeticException e) {
            System.err.println("Errore: divisione per zero non consentita!");
        }
    }

    public static void main(String[] args) {
        divisione(10, 2);
        divisione(10, 0);
    }
}