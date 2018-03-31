package br.com.proj.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agenda{

	public static final String QUERY_ALL = "Agenda.All";
	
	@Id
	@GeneratedValue
	private String user;
	private String message;

	private static List<Agenda> lstMessage = new ArrayList<Agenda>();

	public Agenda() {
	}

	public Agenda(String user, String message) {
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

	public static List<Agenda> getLstMessage() {
		return lstMessage;
	}

	public static void setLstMessage(List<Agenda> lstMessage) {
		Agenda.lstMessage = lstMessage;
	}

	
	
}
