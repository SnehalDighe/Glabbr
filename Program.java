//Todays Concepts in Program: Class,Constructor,Object


import java.io.*;

//Class
class Bank
{
private int accNo;
private String name;
private String accType;


// deafult Constructor
   Bank()
{
}

//Parametrized COnstructor
  Bank(int a,String n,String at)
{
accNo=a;
name=n;
accType=at;
}

void display()
{
System.out.println(accNo+" "+name+""+accType);
}  
}


public class Program
{
 public static void main(String[]args)
{
//class two different objects
Bank bank=new Bank(245566,"Snehal","Saving");
Bank bank1=new Bank(3546647,"Shweta","Join");

bank.display();
bank1.display();

}
}

