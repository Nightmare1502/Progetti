import java.util.ArrayList;

import java.util.ArrayList;

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

        // Stampa della lista iniziale
        System.out.println("Lista degli studenti:");
        for (Student student : students) {
            System.out.println(student);
        }

        students.add(new Student("Maria", 19));
        students.add(new Student("Giulia", 28));
        students.add(new Student("Aurora", 19));
        students.add(new Student("Elena", 78));

        // Stampa della lista aggiornata
        System.out.println("\nLista degli studenti aggiornata:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
