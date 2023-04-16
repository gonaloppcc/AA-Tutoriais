/**
 * Licensee: Gonçalo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteAAData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = pt.uminho.di.aa.AAPersistentManager.instance().getSession().beginTransaction();
		try {
			pt.uminho.di.aa.User lptuminhodiaaUser = pt.uminho.di.aa.User.loadUserByQuery(null, null);
			lptuminhodiaaUser.delete();
			pt.uminho.di.aa.Game lptuminhodiaaGame = pt.uminho.di.aa.Game.loadGameByQuery(null, null);
			lptuminhodiaaGame.delete();
			pt.uminho.di.aa.Plataform lptuminhodiaaPlataform = pt.uminho.di.aa.Plataform.loadPlataformByQuery(null, null);
			lptuminhodiaaPlataform.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteAAData deleteAAData = new DeleteAAData();
			try {
				deleteAAData.deleteTestData();
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
