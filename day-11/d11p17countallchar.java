import java.io.*;
class d11p17countallchar
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\demo\\a.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int count=0;
while((i=br.read())!=-1)
{
char ch=(char)i;
if(((ch>='0')&&(ch<='9'))||((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
{
count++;
}
}
System.out.print(count);
br.close();
fr.close();
}
}