public class Main {
    public static void main(String[] args) {
        // Creazione di un array di numeri interi
        int[] numeri = {10, 20, 30, 40, 50};

        // Chiamata alla funzione con un indice valido
        gestisciDivisione(numeri, 2);

        // Chiamata alla funzione con un indice non valido
        gestisciDivisione(numeri, 10);
    }

    public static void gestisciDivisione(int[] array, int indice) {
        try {
            // Tentativo di accesso all'elemento dell'array
            int valoreSelezionato = array[indice];

            // Tentativo di divisione per zero
            int risultato = valoreSelezionato / 0;

            System.out.println("Risultato della divisione: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore di indice non valido: " + e.getMessage());
        } finally {
            System.out.println("Esecuzione completata del blocco try-catch.");
        }
    }
}
