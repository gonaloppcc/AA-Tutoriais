/**
 * Licensee: Gonçalo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import pt.uminho.di.aa.Game;
import pt.uminho.di.aa.Plataform;
import pt.uminho.di.aa.User;

public class CreateAAData {
    public void createTestData() throws PersistentException {
        PersistentTransaction t = pt.uminho.di.aa.AAPersistentManager.instance().getSession().beginTransaction();
        try {
            Plataform plataform = Plataform.createPlataform();
            plataform.setName("plataform name");
            plataform.setYear(0);
            plataform.setDescription("plataform description");
            plataform.setManufacturer("plataform manufacturer");
            plataform.save();

            Game game = Game.createGame();
            game.setName("game name");
            game.setYear(0);
            game.setDescription("game description");
            game.setPrice(0.0);
            game.setPlataform(plataform);
            game.save();

            User user = User.createUser();
            user.setName("user name");
            user.setEmail("user email");
            user.setPassword("user password");
            user.game.add(game);
            user.save();

            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }

    public static void main(String[] args) {
        try {
            CreateAAData createAAData = new CreateAAData();
            try {
                createAAData.createTestData();
            } finally {
                pt.uminho.di.aa.AAPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
