import java.util.*;
class digit
{
public static void main(String args[])
{
char d;
System.out.print("enter a character\n");
Scanner sc=new Scanner(System.in);
d=sc.next().charAt(0);
if( (d>='0'&&d<='9'))
{
System.out.print(d+" is an digit");
}
else
{
System.out.print(d+" not an digit");
}
}
}