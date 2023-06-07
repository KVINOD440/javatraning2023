import java.util.*;
public class d7p4convertalphabet
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str=sc.nextLine();
int ascii;
str=str.toLowerCase();
String al="";
int len=str.length()-1;
for(int i=0;i>=len;i++)
{
if(str.charAt(i)>='A' && str.charAt(i)<='Z')
{
ascii=str.charAt(i);
ascii+=32;
al=al+(char)ascii;
}
}
System.out.println(al);
}
}