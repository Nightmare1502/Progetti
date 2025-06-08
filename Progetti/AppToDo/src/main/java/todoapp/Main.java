package todoapp;

import model.ToDo;
import repository.ToDoRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        ToDoRepository repo = new ToDoRepository();

        boolean esegue = true;
        Scanner scan = new Scanner(System.in);

        while (esegue) {

            System.out.println("---MENU PRINCIPALE---");
            System.out.println("Cosa desideri fare?");
            System.out.println("\n1 - Vedi lista ToDo");
            System.out.println("2 - Aggiungere ToDo");
            System.out.println("3 - Eliminare ToDo");
            System.out.println("4 - Completa ToDo");
            System.out.println("0 - Esci");

            String input = scan.nextLine();

            switch (input) {
                case "1" -> {
                    List<ToDo> todos = repo.findAll();
                    if (todos.isEmpty()) {
                        System.out.println("La lista è vuota!");
                    } else {
                        for (ToDo todo : todos) {
                            System.out.println(todo.getId() + " - " + todo.getTitolo() + " - Completato: " + todo.isCompletato());
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Inserisci una descrizione del tuo ToDo");
                    String descrizione = scan.nextLine();

                    if (!descrizione.isBlank()) {
                        ToDo nuovoTodo = new ToDo(descrizione);
                        repo.create(nuovoTodo);
                        System.out.println("ToDo creato con successo!");
                    } else {
                        System.err.println("Devi inserire la descrizione del ToDo!");
                    }
                }
                case "3" -> {
                    System.out.println("Scegli l'ID del tuo ToDo da eliminare: ");
                    List<ToDo> todos = repo.findAll();
                    if (todos.isEmpty()) {
                        System.out.println("La lista è vuota!");
                    } else {
                        for (ToDo todo : todos) {
                            System.out.println(todo.getId() + " - " + todo.getTitolo());
                        }
                    }
                    int todoElimina = scan.nextInt();
                    scan.nextLine();

                    if (todoElimina <= 0) {
                        System.err.println("ID non valido!");
                    } else {
                        repo.deleteById(todoElimina);
                        System.out.println("ToDo eliminato con successo!");
                    }
                }
                case "4" -> {
                    System.out.println("Inserisci l'ID del ToDo da impostare come completato");
                    List<ToDo> todos = repo.findAll();
                    if (todos.isEmpty()) {
                        System.out.println("La lista è vuota!");
                    } else {
                        for (ToDo todo : todos) {
                            System.out.println(todo.getId() + " - " + todo.getTitolo());
                        }
                    }
                    int todoCompleta = scan.nextInt();
                    scan.nextLine();

                    if (todoCompleta <= 0) {
                        System.err.println("ID non valido!");
                    } else {
                        repo.completatoById(todoCompleta);
                        System.out.println("ToDo aggiornato con successo!");
                    }
                }
                case "0" -> esegue = false;
            }
        }
    }
}