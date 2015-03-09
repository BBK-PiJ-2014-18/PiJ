import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class EchoServerLauncher {

	
	public static void main (String[] args) {
		EchoServerLauncher esl = new EchoServerLauncher();
		esl.launch();
		
	}
	
	private void launch() {
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.out.println(">1<");
			System.setSecurityManager(new RMISecurityManager());
			System.out.println(">2<");
		}
		try {
			//create the registry if there is not one
			System.out.println(">3<");
			LocateRegistry.createRegistry(1099);
			//create the server object
			System.out.println(">4<");
			EchoServer server = new EchoServer();
			//register (bind) the server object on the registry
			//The registry may be on a different machine
			String registryHost = "//localhost/";
			String serviceName = "echo";
			System.out.println(">5<");
			Naming.rebind(registryHost + serviceName,  server);
			System.out.println(">6<");
		} catch(MalformedURLException ex) {
			ex.printStackTrace();
		} catch(RemoteException ex) {
			ex.printStackTrace();
		}
		
	
	}
}
