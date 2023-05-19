package ru.zhukov.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.zhukov.springcourse.models.Person;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Person> index() {
        List<Person> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM \"public\".\"Person\"";
            ResultSet res = statement.executeQuery(SQL);

            while(res.next()) {
                Person person = new Person();

                person.setId(res.getInt("id"));
                person.setEmail(res.getString("email"));
                person.setAge(res.getInt("age"));
                person.setName(res.getString("name"));

                people.add(person);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return people;
    }

   /* public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }*/

    public void save(Person person) {
        //person.setId(++PEOPLE_COUNT);
        //people.add(person);

        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO \"public\".\"Person\" VALUES(" + 1 + ",'" + person.getName() + "'" +
                    "," + person.getAge() + ",'" + person.getEmail() + "')";
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

/*    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
        personToBeUpdated.setName(updatedPerson.getName());
    }*/

    public void delete(int id) {
        //people.removeIf(person -> person.getId() == id);
    }
}
