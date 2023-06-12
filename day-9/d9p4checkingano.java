import java.io.*;
import java.util.*;
class d9p4checkingano{
static boolean isnumber(String s)
{
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))==false)
return false;
}
return true; 
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(isnumber(str))
System.out.println("integer");
else
System.out.println("String");

}
}
