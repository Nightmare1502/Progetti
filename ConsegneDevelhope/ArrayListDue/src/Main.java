/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */


import java.util.*;

class Student {

    public String name;
    public int age;

    //Metodo costruttore
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Metodo getter e setter pubblici
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Override to string per una stampa leggibile
    @Override
    public String toString() {
        return "Student {Name = '" + name + "', Age = "  + age + "}";

    }
}



public class Main {
    public static void main(String[] args) {

        // Creazione di una lista di studenti
        ArrayList<Student> students = new ArrayList<>();

        // Aggiunta di oggetti Student alla lista
        students.add(new Student("Mario", 18));
        students.add(new Student("Luigi", 19));
        students.add(new Student("Maria", 19));
        students.add(new Student("Giulia", 28));
        students.add(new Student("Aurora", 19));
        students.add(new Student("Elena", 78));
        students.add(new Student("Alberto", 18));
        students.add(new Student("Bernardo", 19));
        students.add(new Student("Barbara", 19));
        students.add(new Student("Enrico", 28));
        students.add(new Student("Laura", 19));
        students.add(new Student("Nadia", 78));

        // Stampa della lista iniziale
        System.out.println("Lista degli studenti:");
        for (Student student : students) {
            System.out.println(student);
        }

        //comparazione per ordinare la lista in ordine alfabetica
        students.sort(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));

        /*
        per ordinare in ordine d'età:
        students.sort(Comparator.comparingInt(Student::getAge));
        */

        // Stampa della lista ordinata
        System.out.println("\nLista degli studenti aggiornata:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
