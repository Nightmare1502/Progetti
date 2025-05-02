public class Main {

    // 1. Funzione che accetta 2 int e ne stampa la somma
    public static void sommaInt(int a, int b) {
        int somma = a + b;
        System.out.println("Somma (int): " + somma);
    }

    // 2. Funzione che accetta 1 char e lo stampa
    public static void stampaChar(char c) {
        System.out.println("Char: " + c);
    }

    // 3. Funzione che accetta 2 Integer e ne stampa la somma
    public static void sommaInteger(Integer a, Integer b) {
        if (a == null || b == null) {
            System.out.println("Uno dei valori è null.");
        } else {
            int somma = a + b; // auto-unboxing
            System.out.println("Somma (Integer): " + somma);
        }
    }

    // 4. Funzione che accetta 1 Character e lo stampa
    public static void stampaCharacter(Character c) {
        if (c == null) {
            System.out.println("Character è null.");
        } else {
            System.out.println("Character: " + c); // auto-unboxing
        }
    }

    public static void main(String[] args) {
        // 5. Autoboxing di valori primitivi
        int primitivoInt = 42;
        double primitivoDouble = 3.14;
        char primitivoChar = 'A';

        // Autoboxing: da primitivo a oggetto
        Integer boxedInt = primitivoInt;
        Double boxedDouble = primitivoDouble;
        Character boxedChar = primitivoChar;

        System.out.println("Autoboxing:");
        System.out.println("Integer: " + boxedInt);
        System.out.println("Double: " + boxedDouble);
        System.out.println("Character: " + boxedChar);

        // 6. Unboxing: da oggetto a primitivo
        Integer oggettoInteger = Integer.valueOf(100);
        Double oggettoDouble = Double.valueOf(2.718);
        Character oggettoCharacter = Character.valueOf('Z');

        // Unboxing automatico
        int unboxedInt = oggettoInteger;
        double unboxedDouble = oggettoDouble;
        char unboxedChar = oggettoCharacter;

        System.out.println("\nUnboxing:");
        System.out.println("int: " + unboxedInt);
        System.out.println("double: " + unboxedDouble);
        System.out.println("char: " + unboxedChar);

        // Test delle funzioni
        System.out.println("\nTest funzioni:");
        sommaInt(10, 5);
        stampaChar('J');
        sommaInteger(30, 12);
        stampaCharacter('C');
    }
}
