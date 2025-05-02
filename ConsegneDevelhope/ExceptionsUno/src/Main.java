public class Main {
    public static boolean isInRange(int number, int min, int max) throws Exception {
        // if statement per controllare se il numero è nell'intervallo
        if (number >= min && number <= max) {
            return true;
        } else {
            throw new Exception("Il numero " + number + " non è nell'intervallo [" + min + ", " + max + "]");
        }
    }

    public static void main(String[] args) {
        int numero = 7; // Variabile da controllare
        try {
            System.out.println(isInRange(numero, 5, 15)); // Lancerà un'eccezione
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
