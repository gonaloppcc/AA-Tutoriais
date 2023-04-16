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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Plataform {
	public Plataform() {
	}
	
	public static Plataform loadPlataformByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return loadPlataformByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform getPlataformByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return getPlataformByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform loadPlataformByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return loadPlataformByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform getPlataformByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return getPlataformByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform loadPlataformByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Plataform) session.load(pt.uminho.di.aa.Plataform.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform getPlataformByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Plataform) session.get(pt.uminho.di.aa.Plataform.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform loadPlataformByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Plataform) session.load(pt.uminho.di.aa.Plataform.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform getPlataformByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Plataform) session.get(pt.uminho.di.aa.Plataform.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlataform(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return queryPlataform(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlataform(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return queryPlataform(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform[] listPlataformByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return listPlataformByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform[] listPlataformByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return listPlataformByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlataform(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pt.uminho.di.aa.Plataform as Plataform");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlataform(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pt.uminho.di.aa.Plataform as Plataform");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Plataform", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform[] listPlataformByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPlataform(session, condition, orderBy);
			return (Plataform[]) list.toArray(new Plataform[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform[] listPlataformByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPlataform(session, condition, orderBy, lockMode);
			return (Plataform[]) list.toArray(new Plataform[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform loadPlataformByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return loadPlataformByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform loadPlataformByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return loadPlataformByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform loadPlataformByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Plataform[] plataforms = listPlataformByQuery(session, condition, orderBy);
		if (plataforms != null && plataforms.length > 0)
			return plataforms[0];
		else
			return null;
	}
	
	public static Plataform loadPlataformByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Plataform[] plataforms = listPlataformByQuery(session, condition, orderBy, lockMode);
		if (plataforms != null && plataforms.length > 0)
			return plataforms[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePlataformByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return iteratePlataformByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlataformByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AAPersistentManager.instance().getSession();
			return iteratePlataformByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlataformByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pt.uminho.di.aa.Plataform as Plataform");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlataformByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pt.uminho.di.aa.Plataform as Plataform");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Plataform", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Plataform loadPlataformByCriteria(PlataformCriteria plataformCriteria) {
		Plataform[] plataforms = listPlataformByCriteria(plataformCriteria);
		if(plataforms == null || plataforms.length == 0) {
			return null;
		}
		return plataforms[0];
	}
	
	public static Plataform[] listPlataformByCriteria(PlataformCriteria plataformCriteria) {
		return plataformCriteria.listPlataform();
	}
	
	public static Plataform createPlataform() {
		return new pt.uminho.di.aa.Plataform();
	}
	
	public boolean save() throws PersistentException {
		try {
			AAPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			AAPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			AAPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			AAPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private int ID;
	
	private String name;
	
	private int year;
	
	private String description;
	
	private String manufacturer;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setYear(int value) {
		this.year = value;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setManufacturer(String value) {
		this.manufacturer = value;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
