

//Singletone with Enum

public class Connection
{

public enum ConnectionState 
{
 WIFI,MobileNetwork,NoConnection 
}

private ConnectionState CS;

private static Connection connection=new Connection();


//Private ctor
  private Connection( )
{

}

//public Connection( EnumState.ConnectionState C)
//{
//this.CS=C;
//}
 public void  getState()
{
switch(CS)
{
               case WIFI:
                System.out.println("Connected to WIFI.");
                break;
                     
              case MobileNetwork:
                System.out.println("Connected to MobileNetwork");
                break;
                          
            case NoConnection: 
                System.out.println("Connected to NoConnection");
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

Connection object=Connection.getInstance();

object.getState();


}
}



