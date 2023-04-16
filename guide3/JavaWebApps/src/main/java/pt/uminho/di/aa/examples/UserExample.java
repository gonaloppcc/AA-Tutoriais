package pt.uminho.di.aa.examples;

import org.orm.PersistentException;
import pt.uminho.di.aa.User;

import java.util.Arrays;

public class UserExample {
    public static void main(String[] args) {
        try {
            User user = new User();
            user.setName("John");
            user.setEmail("john@email.com");
            user.setPassword("123456");
            user.save();
            System.out.println("User created: " + user.getName());
        } catch (PersistentException e) {
            System.out.println("Error creating user: " + e.getMessage());
        }

        try {
            System.out.println("Running this query: " + "Name='John'");
            User[] users = User.listUserByQuery("Name='John'", null);

            Arrays.stream(users).forEach(user -> System.out.println("User with id " + user.getID() + " found"));

        } catch (PersistentException e) {
            System.out.println("Error loading user: " + e.getMessage());
        }

        System.out.println("Done");
    }
}
