import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class EchoClientLauncher {

	public static void main (String[] args) {
		EchoClientLauncher ecl = new EchoClientLauncher();
		ecl.launch(args[0]);
	}
	
	private void launch(String text) {
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.out.println(">1<");
			System.setSecurityManager(new RMISecurityManager());
			System.out.println(">2<");
		}
	
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/echo");
			EchoService echoService = (EchoService) service;
			String receivedEcho = echoService.echo(text);
			System.out.println("receivedEcho is: " + receivedEcho);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}
