import java.io.*;
public class CopyFiles
{
public static void main(String args[]) throws IOException
{
FileInputStream in=null;
FileOutputStream op=null;


try{
in=new FileInputStream("Input.txt");
op=new FileOutputStream("Output.txt");
int c;

while((c=in.read())!=-1)
{
op.write(c);
}

}finally
{
if(in!=null)
{
in.close();
}
if(op!=null)
{
op.close();
}

}

}

}
