import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creare e ottenere un HashSet riempito
        HashSet<String> macchine = creaHashSet();

        // Stampare la grandezza del set
        System.out.println("Grandezza dell'HashSet: " + macchine.size());

        // Stampare gli elementi del set
        System.out.println("Elementi dell'HashSet:");
        for (String auto : macchine) {
            System.out.println(auto);
        }
    }

    // Funzione che crea e restituisce un HashSet riempito
    public static HashSet<String> creaHashSet() {
        HashSet<String> macchine = new HashSet<>();

        // Aggiungere elementi al set
        macchine.add("BMW");
        macchine.add("Audi");
        macchine.add("Ferrari");
        macchine.add("Porsche");
        macchine.add("Lamborghini");

        return macchine; // Restituisce l'HashSet riempito
    }
}
