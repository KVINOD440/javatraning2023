import java.util.*;
class string1
{
public static void main(String args[])
{
char ch;
System.out.print("enter a character\n");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if( (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.print(ch+" is an alphabet ");
}
else
{
System.out.print(ch+" not an alphabet");
}
}
}