import java.util.Scanner;
class dayno1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("input\n");
int dn;
dn=scob.nextInt();
System.out.print("output\n");
switch(dn)
{
case 0: System.out.println("SUNDAY");break;
case 1: System.out.println("MONDAY");break;
case 2: System.out.println("TUESDAY");break;
case 3: System.out.println("WEDNESDAY");break;
case 4: System.out.println("THRUSDAY");
case 5: System.out.println("FRIDAY");
case 6: System.out.println("SATURDAY");
default: System.out.println("INVALID"); 
}
}
}