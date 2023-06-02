import java.util.*;
class string
{
public static void main(String args[])
{
System.out.print("enter your name");
Scanner sc=new Scanner(System.in);
String n=sc.next();
System.out.println("Enter your extracting position character from a string");
int a=sc.nextInt();
char ch=n.charAt(a);
System.out.println("Welcome"+n);
}
}