import java.io.*;
class d11p9bufferreader
{
public static void main(String args[])throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
String name="";
while(!name.equals("stop"))
{
name=br.readLine();
System.out.println("Data is "+name);
}
br.close();
r.close();
}
}
