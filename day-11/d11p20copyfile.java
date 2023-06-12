class d11p20copyfile
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\demo\\demo.txt");
BufferedReader br=new BufferedReader(fr);
CharArrayWriter out=new CharArrayWriter();
int i;
while((i=br.read())1=-1)
{
out.write((char)i);
}
FileReader f1=new FileReader("C\\demo\\a.txt");
out.writeTo(f1);
f1.close();
System.out.print("Sucess...");
}
}