import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		String nome = "";
		String msgp = "";
		

		nome = JOptionPane.showInputDialog("Bem vindo ao Chat! Qual o seu nome? ");
		System.out.println(nome + " entrou no Chat");
		
		try {
			while (!msgp.equals("0")) {
				msgp = JOptionPane.showInputDialog("Chat - " + nome + " Entre com a mensagem. (Entre com 0 para sair)");
				IChatAula objChat = (IChatAula) Naming.lookup("rmi://localhost:8282/chat");
				Message msg = new Message(nome, msgp, true);
				objChat.sendMessage(msg);
				System.out.println(returnMessage(objChat.retrieveMessage()));
				new ChatAula().inserirBanco(nome,msgp);
				if(msgp.equals("0")) {
					msg.setStat(false);
					System.out.println(msg.getUsuario() + " saiu do Chat");
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String returnMessage(List<Message> lst) {
		String valor = "";
		for (Message message : lst) {
			valor += message.getUsuario() + ": " + message.getMensagem() + "\n";
		}
		return valor;
	}

}
