package br.com.proj.test;

import br.com.proj.controller.BancoDB;
import br.com.proj.model.Banco;

public class TesteInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		banco.setUser("Raul");
		banco.setMessage("Olá!");
		new BancoDB().insert(banco);
	}

}
