

//Singletone with Enum
public class Connection
{
private static Connection connection=new Connection();
public enum ConnectionState 
{
 WIFI,MobileNetwork,NoConnection;

}

//Private ctor
  private Connection( )
{

}


 public void  getState(ConnectionState cs)
{
switch(cs)
{
               case WIFI:
                System.out.println("Connected to WIFI.");
                break;
                     
              case MobileNetwork:
                System.out.println("Connected to MobileNetwork");
                break;
                          
            case NoConnection: 
                System.out.println("Connected to No Internet Connection");
                break;
 default:
                System.out.println("No State available.");
                break;
}
}
//get only object 
public static Connection getInstance()
{
return connection;
}

public static void main(String []args)
{
 connection.getState(ConnectionState.WIFI);


}
}



