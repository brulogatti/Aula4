import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import br.com.proj.controller.BancoDB;
import br.com.proj.model.Banco;


public class ChatAula extends UnicastRemoteObject implements IChatAula {

	public ChatAula() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 4332181098452762552L;

	public void sendMessage(Message msg) throws RemoteException {
		Message.setLstMessage(msg);
	}

	public List<Message> retrieveMessage() throws RemoteException {
		return Message.getLstMessage();
	}

	@Override
	public void inserirBanco(String user, String msg) throws RemoteException {
		Banco banco = new Banco();
		banco.setMessage(msg);
		banco.setUser(user);
		new BancoDB().insert(banco);
	}
}
