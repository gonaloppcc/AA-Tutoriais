package pt.uminho.di.aa;

import org.orm.PersistentException;

import java.util.List;
import java.util.Scanner;


public class GMS {

    public GMS() {
    }

    public static void registerUser(User user) throws PersistentException {
        User dbUser = User.createUser();
        dbUser.setName(user.getName());
        dbUser.setEmail(user.getEmail());
        dbUser.setPassword(user.getPassword());
        dbUser.save();
    }

    public static void registerGame(Game game) throws PersistentException {
        Game dbGame = Game.createGame();
        dbGame.setName(game.getName());
        dbGame.setYear(game.getYear());
        dbGame.setDescription(game.getDescription());
        dbGame.setPrice(game.getPrice());
        dbGame.setPlataform(game.getPlataform());
        dbGame.save();
    }

    public static void registerPlatform(Plataform platform) throws PersistentException {
        Plataform dbPlatform = Plataform.createPlataform();
        dbPlatform.setName(platform.getName());
        dbPlatform.setYear(platform.getYear());
        dbPlatform.setDescription(platform.getDescription());
        dbPlatform.setManufacturer(platform.getManufacturer());
        dbPlatform.save();
    }

    public static List<Game> getUserGames(int userID) throws PersistentException {
        return (List<Game>) Game.queryGame("User.ID = " + userID, null);
    }

    public static List<Game> getAllGames() throws PersistentException {
        return (List<Game>) Game.queryGame(null, null);
    }

    public static List<Game> searchGames(String gameName) throws PersistentException {
        return (List<Game>) Game.queryGame("Name = '" + gameName + "'", null);
    }

    public static void deleteGame(int gameID) throws PersistentException {
        Game game = Game.getGameByORMID(gameID);
        game.delete();
    }

    public static Plataform getPlataformByID(int ID) throws PersistentException {
        return Plataform.loadPlataformByORMID(ID);
    }


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
            case 1 -> System.out.println("Register User not implemented for now");
            case 2 -> registerGameUI();
            case 3 -> System.out.println("Register Platform not implemented for now");
            case 4 -> System.out.println("Get User Games not implemented for now");
            case 5 -> getAllGamesUI();
            case 6 -> System.out.println("Search Games not implemented for now");
            case 7 -> System.out.println("Delete Game not implemented for now");
            case 0 -> {
                System.out.println("Exiting...");
                return false;
            }
            default -> System.out.println("Invalid Option");
        }

        return true;

    }

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

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            running = menu();
        }

        System.out.println("Goodbye!");
    }
}
