import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {

    public AdderRemote() throws RemoteException{ }

    public int add(int a , int b) throws RemoteException{

        int result = a + b;
        return result;
    }



}
