package br.com.proj.test;

import java.io.Serializable;

import br.com.proj.controller.AgendaDB;
import br.com.proj.model.Agenda;
import junit.framework.TestCase;



public class Test extends TestCase implements Serializable {

	public void testInsert() {
		Agenda agenda = new Agenda();
		agenda.setUser(user);
		agenda.setMessage(message);
		assertEquals(new AgendaDB().insert(agenda), true);
	}

	public void testUpdate() {
		Agenda agenda = new Agenda();
		agenda.setUser(user);
		agenda.setMessage(message);
		assertEquals(new AgendaDB().update(agenda), true);
	}

	public void testDelete() {
		Agenda agenda = new Agenda();
		agenda.setUser();
		assertEquals(new AgendaDB().delete(agenda), true);
	}

	public void testSelectTo() {
		assertNotNull(new AgendaDB().selectTo());
	}
	
	public void testSelectAll() {
		assertNotNull(new AgendaDB().selectAll());
	}

}
