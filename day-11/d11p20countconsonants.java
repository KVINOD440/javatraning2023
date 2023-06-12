import java.io.*;
class d11p20countconsonants
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
if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u')&&(ch!='A')&&(ch!='E')&&(ch!='I')&&(ch!='O')&&(ch!='U'))
{
count++;
}
}
System.out.print(count);
br.close();
fr.close();
}
}