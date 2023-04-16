package pt.uminho.di.aa;

import org.orm.PersistentException;

import java.util.List;
import java.util.Scanner;

import static pt.uminho.di.aa.GMSLogic.*;


public class GMS {

    public static boolean menu() {
        Scanner scannerIn = new Scanner(System.in);

        System.out.println("GCM - Game Management System");
        System.out.println("1 - Register User");
        System.out.println("2 - Register Game");
        System.out.println("3 - Register Platform");
        System.out.println("4 - Get User Games");
        System.out.println("5 - Get All Games");
        System.out.println("6 - Search Games");
        System.out.println("7 - Delete Game");
        System.out.println("0 - Exit");

        System.out.print("Option: ");

        int option = 0;
        try {
            option = scannerIn.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid option");
        }

        switch (option) {
            case 1 -> registerUserUI();
            case 2 -> registerGameUI();
            case 3 -> registerPlatformUI();
            case 4 -> getUserGamesUI();
            case 5 -> getAllGamesUI();
            case 6 -> searchGamesUI();
            case 7 -> deleteGameUI();
            case 0 -> {
                System.out.println("Exiting...");
                return false;
            }
            default -> System.out.println("Invalid Option");
        }

        return true;

    }

    /**
     * Option 1
     */
    private static void registerUserUI() {
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scannerIn.nextLine();
        System.out.print("Email: ");
        String email = scannerIn.nextLine();
        System.out.print("Password: ");
        String password = scannerIn.nextLine();

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        try {
            registerUser(user);
        } catch (PersistentException e) {
            System.out.println("Error registering user");
        }
    }

    /**
     * Option 2
     */
    private static void registerGameUI() {
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scannerIn.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(scannerIn.nextLine());
        System.out.print("Description: ");
        String description = scannerIn.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(scannerIn.nextLine());

        int plataformID = 0;
        Plataform plataform = null;
        boolean invalidPlataform = true;
        System.out.print("Plataform's ID: ");

        while (invalidPlataform) {
            plataformID = scannerIn.nextInt();

            try {
                plataform = getPlataformByID(plataformID);
            } catch (PersistentException e) {
                System.out.println("Nothing went wrong, try again");
            }

            invalidPlataform = false;
        }


        Game game = new Game();
        game.setName(name);
        game.setYear(year);
        game.setDescription(description);
        game.setPrice(price);
        game.setPlataform(plataform);

        try {
            registerGame(game);
        } catch (PersistentException e) {
            System.out.println("Error registering game");
        }
    }

    /**
     * Option 3
     */
    private static void registerPlatformUI() {
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scannerIn.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(scannerIn.nextLine());
        System.out.print("Description: ");
        String description = scannerIn.nextLine();
        System.out.print("Manufacturer: ");
        String manufacturer = scannerIn.nextLine();

        Plataform platform = new Plataform();
        platform.setName(name);
        platform.setYear(year);
        platform.setDescription(description);
        platform.setManufacturer(manufacturer);

        try {
            registerPlatform(platform);
            System.out.println("Platform registered successfully");
        } catch (PersistentException e) {
            System.out.println("Error registering platform");
        }
    }

    /**
     * Option 4
     */
    private static void getUserGamesUI() {
        System.out.println("Not implemented yet");
    }

    /**
     * Option 5
     */
    private static void getAllGamesUI() {
        try {
            List<Game> games = getAllGames();
            System.out.println("Name" + "\t|" + "\tYear" + "\t|" + "\tDescription" + "\t|" + "\tPrice" + "\t|" + "\tPlataform");
            for (Game game : games) {
                System.out.println(game.getName() + "\t|" + "\t" + game.getYear() + "\t|" + "\t" + game.getDescription() + "\t|" + "\t" + game.getPrice() + "\t|" + "\t" + game.getPlataform().getName());
            }
        } catch (PersistentException e) {
            System.out.println("Error getting games");
        }
    }

    /**
     * Option 6
     */
    private static void searchGamesUI() {
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Search: ");
        String search = scannerIn.nextLine();

        try {
            List<Game> games = searchGames(search);
            System.out.println("Name" + "\t|" + "\tYear" + "\t|" + "\tDescription" + "\t|" + "\tPrice" + "\t|" + "\tPlataform");
            for (Game game : games) {
                System.out.println(game.getName() + "\t|" + "\t" + game.getYear() + "\t|" + "\t" + game.getDescription() + "\t|" + "\t" + game.getPrice() + "\t|" + "\t" + game.getPlataform().getName());
            }
        } catch (PersistentException e) {
            System.out.println("Error getting games");
        }
    }

    /**
     * Option 7
     */
    private static void deleteGameUI() {
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Game's ID: ");
        int gameID = scannerIn.nextInt();

        try {
            deleteGame(gameID);
            System.out.println("Game successfully deleted");
        } catch (PersistentException e) {
            System.out.println("Error deleting game");
        }
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            running = menu();
        }

        System.out.println("Goodbye!");
    }
}
