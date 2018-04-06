import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable {

	private static final long serialVersionUID = 6355602437068327334L;

	private String user;
	private String message;
	private boolean stat;

	private static List<Message> lstMessage = new ArrayList<Message>();

	public Message(String user, String message, boolean stat) {
		this.user = user;
		this.message = message;
		this.stat = stat;
	}


	public String getUsuario() {
		return user;
	}

	public void setUsuario(String user) {
		this.user = user;
	}

	public String getMensagem() {
		return message;
	}

	public void setMensagem(String message) {
		this.message = message;
	}

	public boolean getStat() {
		return stat;
	}

	public void setStat(boolean stat) {
		this.stat = stat;
	}

	public static List<Message> getLstMessage() {
		return lstMessage;
	}

	public static void setLstMessage(Message msg) {
		lstMessage.add(msg);
	}

}
