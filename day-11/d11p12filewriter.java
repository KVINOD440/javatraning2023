import java.io.*;
class d11p12filewriter
{
public static void main(String args[])throws Exception
{
CharArrayWriter out=new CharArrayWriter();
out.write("Welcome to this training");
FileWriter f1=new FileWriter("C://demo//a.txt");
FileWriter f2=new FileWriter("C://demo//b.txt");
FileWriter f3=new FileWriter("C://demo//c.txt");
FileWriter f4=new FileWriter("C://demo//d.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();
System.out.println("Sucess......");
}
}