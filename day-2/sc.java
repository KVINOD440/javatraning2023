import java.util.*;
class sc
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
if( (ch>='0'&&ch<='9'))
{
System.out.print(ch+" is an digit");
}
else
{
System.out.println(ch+" is a special character");
}

}=
}