import java.io.CharArrayReader;
public class d11p15countdigit
{
    public static void main(String[] ag) throws Exception
{
 char[] ary={'1','a','v','a','t','p','o','i','n','t'};
 CharArrayReader reader=new CharArrayReader(ary);
 int k=0; int count=0;
 //read until the end of a file
 while((k=reader.read())!= -1)
 {
   char ch=(char)k;
if((ch>='0')&&(ch<='9'))
{
count++;
}
 }
System.out.print(count);
 
}
}