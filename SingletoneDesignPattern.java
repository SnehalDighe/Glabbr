
public class SingletoneDesignPattern
{

//Object creation 
private static SingletoneDesignPattern singltoneInstance=new SingletoneDesignPattern();

//Private ctor
  private SingletoneDesignPattern()
{
}

//get only object 
public static SingletoneDesignPattern getInstance()
{
return singltoneInstance;
}


public void message()
{
System.out.println("Hello this my first Singltone program");
}



 public static void main(String []args)
{

SingletoneDesignPattern object=SingletoneDesignPattern.getInstance();
object.message();


}
}
