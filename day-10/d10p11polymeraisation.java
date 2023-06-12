import java.util.*;
class polymeraisation
{
void print()
{
System.out.println("welcome");
}
void print(String n)
{
System.out.println("Welcome "+n);
}
}
class testpoly
{
public static  void main(String args[])
{
Scanner s=new Scanner(System.in);
polymeraisation ob=new polymeraisation();
ob.print();
System.out.println("please enter your name: ");
String str=s.nextLine();
ob.print(str);
}
}

