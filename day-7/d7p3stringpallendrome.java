import java.util.*;
public class d7p3stringpallendrome
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str=sc.nextLine();
str=str.toLowerCase();
String rs="";
int len=str.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+str.charAt(i);
}
System.out.println("The reverse of a string is "+rs);
if(str.equals(rs))
{
System.out.println(str+" is a pallendrome");
}
else
{
System.out.println(str+" is not a pallendrome");
}
}
}