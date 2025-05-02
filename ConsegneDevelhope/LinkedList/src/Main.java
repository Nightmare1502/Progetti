/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
 */


import java.util.*;

class Fruit {

    private String name;

    //Metodo costruttore
    public Fruit(String name) {
        this.name = name;
    }
    // Metodo getter e setter pubblici
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Override to string per una stampa leggibile
    @Override
    public String toString() {
        return "Fruit name - " + name;}

    }



public class Main {
    public static void main(String[] args) {

        // Creazione di una lista di frutta
        LinkedList<Fruit> fruit = new LinkedList<>();

        // Aggiunta di oggetti Fruit alla lista
        fruit.add(new Fruit("Mela"));
        fruit.add(new Fruit("Pera"));

        // Stampa della lista iniziale
        System.out.println("Lista della frutta:");
        for (Fruit frutta : fruit) {
            System.out.println(frutta);
        }

        // Aggiunta di 2 nuovi oggetti all'inizio e alla fine della lista
        fruit.addFirst(new Fruit("Banana"));
        fruit.addLast(new Fruit("Kiwi"));


        // Stampa della lista aggiornata
        System.out.println("\nLista della frutta aggiornata:");
        for (Fruit frutta : fruit) {
            System.out.println(frutta);
        }

    }
}