import java.rmi.Naming;

public class MyServer {
    public static void main (String[] args){
        try {
            Adder stub = new AdderRemote();
            Naming.rebind("rmi://localhost:5000/newname", stub);
        }catch(Exception e){}


        }
    }
