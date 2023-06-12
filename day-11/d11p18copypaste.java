import java.io.*;
class d11p18copypaste
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\demo\\demo.txt");
BufferedReader br=new BufferedReader(fr);
CharArrayWriter out=new CharArrayWriter();
int i;
while((i=br.read())!=-1)
{
char ch=(char)i;
out.write(ch);
FileWriter f1=new FileWriter("C://demo//demo1.txt");
out.writeTo(f1);
}
br.close();
fr.close();
}
}