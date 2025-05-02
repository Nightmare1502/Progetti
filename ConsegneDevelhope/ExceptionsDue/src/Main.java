public class Main {
    public static void main(String[] args) {
        char c = 'a'; // Carattere da controllare

        // if statement per controllare se il carattere è un numero
        // con try catch per gestire l'eccezione
        if (Character.isDigit(c)) {
            System.out.println(c + " è un numero.");
        } else {
            throw new ArithmeticException("Il carattere " + c + " non è un numero.");
        }
    }
}
