package br.com.proj.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String user;
	private String message;

	private static List<Banco> lstBanco = new ArrayList<Banco>();

	public Banco() {
	}

	public Banco(String user, String message) {
		this.user=user;
		this.message=message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static List<Banco> getLstMessage() {
		return lstBanco;
	}

	public static void setLstMessage(List<Banco> lstMessage) {
		Banco.lstBanco = lstBanco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
