/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */

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

        // Stampa dell'auto cercata
        System.out.println(controlloAuto());
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

    public static boolean controlloAuto() {
        String autoCercata = "Audi";

        boolean disponibile = creaHashSet().contains(autoCercata);

        if (disponibile) {
            System.out.println("Il modello " + autoCercata + " è disponibile");
        } else {
            System.out.println("Il modello " + autoCercata + " non è disponibile");
        }

        return disponibile; // Restituisce true o false
    }

}
