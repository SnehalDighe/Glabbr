import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex1
{
 public static void main(String args[])
{
String str="Hii this is Snehal, I am from Pune....!";
String pattern="(.*)()(.*)(Pune)";

//create pattern object
Pattern p=Pattern.compile(pattern);

//Create matcher object
Matcher m=p.matcher(str);

if(m.find())
{
System.out.println("Found Value:"+m.group(0));
System.out.println("Found Value:"+m.group(1));
System.out.println("Found Value:"+m.group(2));
System.out.println("Found Value:"+m.group(3));
}else
System.out.println("No MAtch found");
System.out.println("\n");

/////////////////////////////////////////////////////////////

   String REGEX = "\\bcat\\b";
  String INPUT = "cat cat cat cattie cat";

Pattern p1=Pattern.compile(REGEX);
Matcher m1=p1.matcher(INPUT);
int count = 0;

      while(m1.find()) {
         count++;
         System.out.println("Match number "+count);
         System.out.println("start(): "+m1.start());
         System.out.println("end(): "+m1.end());
System.out.println("\n");
      }

////////////////////////////////////////////////////////////////

 String REGEXx = "dog";
 String INPUTt = "The dog says meow. " + "All dogs say meow.";
 String REPLACE = "cat";

  
      Pattern p2 = Pattern.compile(REGEXx);
      
     
      Matcher m2 = p2.matcher(INPUTt); 
      INPUTt = m2.replaceAll(REPLACE);
      System.out.println(INPUTt);

}
}
