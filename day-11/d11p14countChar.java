import java.io.CharArrayReader;
public class d11p14countChar
{
    public static void main(String[] ag) throws Exception
{
 char[] ary={'j','a','v','a','t','p','o','i','n','t'};
 CharArrayReader reader=new CharArrayReader(ary);
 int k=0; int count=0;
 //read until the end of a file
 while((k=reader.read())!= -1)
 {
   char ch=(char)k;
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
{
count++;
}
 }
System.out.print(count);
 
}
}
