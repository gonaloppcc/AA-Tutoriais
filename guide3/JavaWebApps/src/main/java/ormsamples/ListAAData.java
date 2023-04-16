/**
 * Licensee: Gonçalo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListAAData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing User...");
		pt.uminho.di.aa.User[] ptuminhodiaaUsers = pt.uminho.di.aa.User.listUserByQuery(null, null);
		int length = Math.min(ptuminhodiaaUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ptuminhodiaaUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Game...");
		pt.uminho.di.aa.Game[] ptuminhodiaaGames = pt.uminho.di.aa.Game.listGameByQuery(null, null);
		length = Math.min(ptuminhodiaaGames.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ptuminhodiaaGames[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Plataform...");
		pt.uminho.di.aa.Plataform[] ptuminhodiaaPlataforms = pt.uminho.di.aa.Plataform.listPlataformByQuery(null, null);
		length = Math.min(ptuminhodiaaPlataforms.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ptuminhodiaaPlataforms[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing User by Criteria...");
		pt.uminho.di.aa.UserCriteria lptuminhodiaaUserCriteria = new pt.uminho.di.aa.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lptuminhodiaaUserCriteria.ID.eq();
		lptuminhodiaaUserCriteria.setMaxResults(ROW_COUNT);
		pt.uminho.di.aa.User[] ptuminhodiaaUsers = lptuminhodiaaUserCriteria.listUser();
		int length =ptuminhodiaaUsers== null ? 0 : Math.min(ptuminhodiaaUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ptuminhodiaaUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing Game by Criteria...");
		pt.uminho.di.aa.GameCriteria lptuminhodiaaGameCriteria = new pt.uminho.di.aa.GameCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lptuminhodiaaGameCriteria.ID.eq();
		lptuminhodiaaGameCriteria.setMaxResults(ROW_COUNT);
		pt.uminho.di.aa.Game[] ptuminhodiaaGames = lptuminhodiaaGameCriteria.listGame();
		length =ptuminhodiaaGames== null ? 0 : Math.min(ptuminhodiaaGames.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ptuminhodiaaGames[i]);
		}
		System.out.println(length + " Game record(s) retrieved."); 
		
		System.out.println("Listing Plataform by Criteria...");
		pt.uminho.di.aa.PlataformCriteria lptuminhodiaaPlataformCriteria = new pt.uminho.di.aa.PlataformCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lptuminhodiaaPlataformCriteria.ID.eq();
		lptuminhodiaaPlataformCriteria.setMaxResults(ROW_COUNT);
		pt.uminho.di.aa.Plataform[] ptuminhodiaaPlataforms = lptuminhodiaaPlataformCriteria.listPlataform();
		length =ptuminhodiaaPlataforms== null ? 0 : Math.min(ptuminhodiaaPlataforms.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ptuminhodiaaPlataforms[i]);
		}
		System.out.println(length + " Plataform record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListAAData listAAData = new ListAAData();
			try {
				listAAData.listTestData();
				//listAAData.listByCriteria();
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
