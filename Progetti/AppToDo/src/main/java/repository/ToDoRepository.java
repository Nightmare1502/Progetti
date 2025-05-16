package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import todoapp.Configuration;
import model.ToDo;

public class ToDoRepository {
    // CRUD
    // create, read, update, delete

    private Connection connection;

    private Configuration configuration = new Configuration();

    public ToDoRepository() throws SQLException {
        connection = DriverManager.getConnection(
                configuration.getProps().getProperty("db.url"),
                configuration.getProps().getProperty("db.user"),
                configuration.getProps().getProperty("db.password")
        );
    }

    public List<ToDo> findAll() throws SQLException {
        List<ToDo> todos = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("SELECT * FROM todo");

        while (results.next()) {
            int id = results.getInt("ID");
            String titolo = results.getString("titolo");
            Timestamp createdAt = results.getTimestamp("created_at");
            Timestamp updatedAt = results.getTimestamp("updated_at");
            boolean completato = results.getBoolean("completato");

            ToDo todo = new ToDo(
                    id,
                    createdAt.toLocalDateTime(),
                    updatedAt != null ? updatedAt.toLocalDateTime() : null,
                    titolo,
                    completato
            );

            todos.add(todo);
        }

        return todos;
    }

    public ToDo findById(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM todo WHERE ID = ?");
        statement.setInt(1, id);
        ResultSet results = statement.executeQuery();

        if (results.next()) {
            String titolo = results.getString("titolo");
            Timestamp createdAt = results.getTimestamp("created_at");
            Timestamp updatedAt = results.getTimestamp("updated_at");
            boolean completato = results.getBoolean("completato");

            ToDo todo = new ToDo(
                    id,
                    createdAt.toLocalDateTime(),
                    updatedAt != null ? updatedAt.toLocalDateTime() : null,
                    titolo,
                    completato
            );
            return todo;
        }

        return null;
    }

    public List<ToDo> findByTitle(String query) throws SQLException {
        List<ToDo> todos = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM todo WHERE titolo LIKE CONCAT('%', ?, '%')");
        statement.setString(1, query);
        ResultSet results = statement.executeQuery();

        while (results.next()) {
            int id = results.getInt("ID");
            String titolo = results.getString("titolo");
            Timestamp createdAt = results.getTimestamp("created_at");
            Timestamp updatedAt = results.getTimestamp("updated_at");
            boolean completato = results.getBoolean("completato");

            ToDo todo = new ToDo(
                    id,
                    createdAt.toLocalDateTime(),
                    updatedAt != null ? updatedAt.toLocalDateTime() : null,
                    titolo,
                    completato
            );
            todos.add(todo);
        }
        return todos;
    }


    public void create(ToDo t) throws SQLException {
        PreparedStatement statement =
                connection.prepareStatement("INSERT INTO todo (titolo) VALUES (?)");

        statement.setString(1, t.getTitolo());
        statement.executeUpdate();
    }

    public void update(ToDo t) throws SQLException {
        if (t.getId() == null) {
            throw new IllegalStateException("Cannot update Todo with NULL id");
        }

        PreparedStatement statement =
                connection.prepareStatement("UPDATE todo SET updated_at = ?, titolo = ?, completato = ? WHERE id = ?");
        statement.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
        statement.setString(2, t.getTitolo());
        statement.setBoolean(3, t.isCompletato());
        statement.setInt(4, t.getId());

        statement.executeUpdate();
    }
}