public class MethodOverloading
{
public static void main(String args[])
{
int a=3;
int b=4;
double c=77;
double d=34;

int result=method(a,b);
double result1=method(c,d);
System.out.println("Multiplication= " + result);
      
      System.out.println(" ADDition= " + result1);

}

public static int method(int n1, int n2) {
      int res;
      res=n1*n2;
      return res; 
   }
   
  
   public static double method(double n1, double n2) {

     double res;
      
 res=n1+n2;
      return res; 
   }
}


