package br.com.proj.controller;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.proj.model.Banco;
import br.com.proj.util.HibernateUtil;

public class BancoDB {
	
	EntityManager entityManager;

	public BancoDB() {
		entityManager = HibernateUtil.getEntityManager();
	}

	public boolean insert(Banco banco) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(banco);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean update(Banco banco) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(banco);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean delete (Banco banco) {
		try {
			entityManager.getTransaction().begin();
			banco = entityManager.find(Banco.class, banco.getUser());
			entityManager.remove(banco);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public Banco selectTo (String user) {
		try {
			entityManager.getTransaction().begin();
			Banco banco = entityManager.find(Banco.class, user);
			entityManager.getTransaction().commit();
			entityManager.close();
			return banco;
		} catch (Exception e) {
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Banco> selectAll () {
		return entityManager.createQuery("FROM " + Banco.class.getName()).getResultList();
	}

}
