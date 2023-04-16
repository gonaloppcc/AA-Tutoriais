/**
 * Licensee: Gonçalo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateAAData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = pt.uminho.di.aa.AAPersistentManager.instance().getSession().beginTransaction();
		try {
			pt.uminho.di.aa.User lptuminhodiaaUser = pt.uminho.di.aa.User.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			lptuminhodiaaUser.save();
			pt.uminho.di.aa.Game lptuminhodiaaGame = pt.uminho.di.aa.Game.loadGameByQuery(null, null);
			// Update the properties of the persistent object
			lptuminhodiaaGame.save();
			pt.uminho.di.aa.Plataform lptuminhodiaaPlataform = pt.uminho.di.aa.Plataform.loadPlataformByQuery(null, null);
			// Update the properties of the persistent object
			lptuminhodiaaPlataform.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving User by UserCriteria");
		pt.uminho.di.aa.UserCriteria lptuminhodiaaUserCriteria = new pt.uminho.di.aa.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lptuminhodiaaUserCriteria.ID.eq();
		System.out.println(lptuminhodiaaUserCriteria.uniqueUser());
		
		System.out.println("Retrieving Game by GameCriteria");
		pt.uminho.di.aa.GameCriteria lptuminhodiaaGameCriteria = new pt.uminho.di.aa.GameCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lptuminhodiaaGameCriteria.ID.eq();
		System.out.println(lptuminhodiaaGameCriteria.uniqueGame());
		
		System.out.println("Retrieving Plataform by PlataformCriteria");
		pt.uminho.di.aa.PlataformCriteria lptuminhodiaaPlataformCriteria = new pt.uminho.di.aa.PlataformCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lptuminhodiaaPlataformCriteria.ID.eq();
		System.out.println(lptuminhodiaaPlataformCriteria.uniquePlataform());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateAAData retrieveAndUpdateAAData = new RetrieveAndUpdateAAData();
			try {
				retrieveAndUpdateAAData.retrieveAndUpdateTestData();
				//retrieveAndUpdateAAData.retrieveByCriteria();
			}
			finally {
				pt.uminho.di.aa.AAPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
