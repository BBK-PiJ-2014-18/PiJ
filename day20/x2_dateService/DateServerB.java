import java.rmi.RemoteException;
import java.time.LocalDate;


public class DateServerB extends UnicastRemoteObject implements DateServiceB {

	public DateServerB() throws RemoteException{
		//nothing to intialise
	}
	
	@Override
	public String getDate() throws RemoteException {
//		LocalDate ld = LocalDate.now();
//		String result = ld.toString();
		String result = "A date";
		return result;
	}

}
