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
            System.out.println("4 - Cercare ToDo");
            System.out.println("0 - Esci");

            String input = scan.nextLine();

            switch (input) {
                case "1":
                    List<ToDo> todos = repo.findAll();
                    if (todos.isEmpty()) {
                        System.out.println("La lista è vuota!");
                    } else {
                        for (ToDo todo : todos)
                            System.out.println(todo.getId() + " - " + todo.getTitolo() + " - Completato: " + todo.isCompletato());
                    }
                    break;
                case "0":
                    esegue = false;
            }

            int ricercaId = 3;
            ToDo todo3 = repo.findById(ricercaId);

            if (todo3 != null) {
                todo3.setTitolo("TODO 3");
                todo3.setCompletato(true);
                repo.update(todo3);
            } else {
                System.out.println("TODO con id " + ricercaId + " non trovato");
            }

            List<ToDo> todos = repo.findAll();
            for (ToDo t : todos) {
                System.out.println(t);
            }

//
//		// INSERT INTO todos (titolo) VALUES (?)
//		System.out.print("Inserisci il titolo del TODO: ");
//		String titoloTodo = scan.nextLine();
//
//		repo.create(new Todo(titoloTodo));


        }
    }
}