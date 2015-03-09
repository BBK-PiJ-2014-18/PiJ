import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;


public interface DateServiceB extends Remote{

		public String getDate() throws RemoteException;
}
