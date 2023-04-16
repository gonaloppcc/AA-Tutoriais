/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Gonçalo(Universidade do Minho)
 * License Type: Academic
 */
package pt.uminho.di.aa;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PlataformCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final IntegerExpression year;
	public final StringExpression description;
	public final StringExpression manufacturer;
	
	public PlataformCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		year = new IntegerExpression("year", this);
		description = new StringExpression("description", this);
		manufacturer = new StringExpression("manufacturer", this);
	}
	
	public PlataformCriteria(PersistentSession session) {
		this(session.createCriteria(Plataform.class));
	}
	
	public PlataformCriteria() throws PersistentException {
		this(AAPersistentManager.instance().getSession());
	}
	
	public Plataform uniquePlataform() {
		return (Plataform) super.uniqueResult();
	}
	
	public Plataform[] listPlataform() {
		java.util.List list = super.list();
		return (Plataform[]) list.toArray(new Plataform[list.size()]);
	}
}

