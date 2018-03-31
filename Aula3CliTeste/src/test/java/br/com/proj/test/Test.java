package br.com.proj.test;


import br.com.proj.controller.BancoDB;
import br.com.proj.model.Banco;
import junit.framework.TestCase;

public class Test extends TestCase {
	
	public void testInsert() {
		Banco banco = new Banco();
		banco.setUser("Raul");
		banco.setMessage("Olá!");
		assertEquals(new BancoDB().insert(banco), true);
	}

	public void testUpdate() {
		Banco banco = new Banco();
		banco.setUser("Raul");
		banco.setMessage("Tchau!");
		assertEquals(new BancoDB().insert(banco), true);
	}

	public void testDelete() {
		Banco banco = new Banco();
		banco.setUser("Raul");
		assertEquals(new BancoDB().insert(banco), true);
	}

	/*public void testSelectTo() {
		assertNotNull(new BancoDB().selectTo());
	}*/
	
	public void testSelectAll() {
		assertNotNull(new BancoDB().selectAll());
	}

}
