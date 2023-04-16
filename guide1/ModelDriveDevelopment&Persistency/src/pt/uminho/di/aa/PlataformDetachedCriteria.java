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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PlataformDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final IntegerExpression year;
	public final StringExpression description;
	public final StringExpression manufacturer;
	
	public PlataformDetachedCriteria() {
		super(pt.uminho.di.aa.Plataform.class, pt.uminho.di.aa.PlataformCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		year = new IntegerExpression("year", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		manufacturer = new StringExpression("manufacturer", this.getDetachedCriteria());
	}
	
	public PlataformDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pt.uminho.di.aa.PlataformCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		year = new IntegerExpression("year", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		manufacturer = new StringExpression("manufacturer", this.getDetachedCriteria());
	}
	
	public Plataform uniquePlataform(PersistentSession session) {
		return (Plataform) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Plataform[] listPlataform(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Plataform[]) list.toArray(new Plataform[list.size()]);
	}
}

