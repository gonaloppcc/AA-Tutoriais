package pt.uminho.aa;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try {
            // 1 - Configuration
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            StandardServiceRegistry sr = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            // 2 - SessionFactory
            SessionFactory sf = configuration.addAnnotatedClass(Game.class).buildSessionFactory(sr);

            // 3 - Session
            Session s = sf.openSession();
            s.setFlushMode(FlushMode.COMMIT.toJpaFlushMode()); //propagate changes on commit

            // 4 - start the transaction
            Transaction t = s.beginTransaction();

            // Create a new object
            Game g = new Game();
            g.setName("GTA V");
            g.setPrice(60.0);
            g.setDescription("GTA V is a game");
            g.setYear(2013);
            //g.set...


            // 5 - save the object
            s.persist(g);

            try {
                // 6 - commit the transaction
                t.commit();
            } catch (Exception e) {
                // 6 - rollback in case of exception
                t.rollback();
                e.printStackTrace();
                System.out.println("Unable to commit changes");
            }

            // 7 - Close the session and end process
            s.close();
            StandardServiceRegistryBuilder.destroy(sr);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to connect to hibernate");
        }
    }

}
