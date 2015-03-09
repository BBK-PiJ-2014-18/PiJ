import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class DateServerLauncherB {

	
	public static void main (String[] args) {
		DateServerLauncherB dslb = new DateServerLauncherB();
		dslb.launch();
	}
	
	public void launch() {
		
		if(System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			LocateRegistry.createRegistry(1099);
			DateServerB serverb = new DateServerB();
			String registryHost = "//localhost/";
			String serviceName = "dateb";
			Naming.rebind(registryHost + serviceName, serverb);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch(RemoteException ex) {
			ex.printStackTrace();
		}	
	}
}
