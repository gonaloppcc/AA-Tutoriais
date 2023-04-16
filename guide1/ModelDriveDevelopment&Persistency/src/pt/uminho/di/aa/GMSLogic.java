package pt.uminho.di.aa;

import org.orm.PersistentException;

import java.util.List;

public class GMSLogic {


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

    public static Game[] getUserGames(int userID) throws PersistentException {
        throw new UnsupportedOperationException("Not supported yet."); // TODO: Implement this method
    }

    public static List<Game> getAllGames() throws PersistentException {
        return (List<Game>) Game.queryGame(null, null);
    }

    public static List<Game> searchGames(String gameName) throws PersistentException {
        return (List<Game>) Game.queryGame("Name LIKE '%" + gameName + "%'", null);
    }

    public static void deleteGame(int gameID) throws PersistentException {
        Game game = Game.getGameByORMID(gameID);
        game.delete();
    }

    public static Plataform getPlataformByID(int ID) throws PersistentException {
        return Plataform.loadPlataformByORMID(ID);
    }
}
