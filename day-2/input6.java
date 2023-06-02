import java.util.Scanner;
class dayno1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("input\n");
int dn;
dn=scob.nextInt();
switch(dn)
{
case 0: System.out.println("SUNDAY");break;
case 1: System.out.println("MONDAY");break;
case 2: System.out.println("TUESDAY");break;
case 3: System.out.println("WEDNESDAY");break;
case 4: System.out.println("THRUSDAY");break;
case 5: System.out.println("FRIDAY");break;
case 6: System.out.println("SATURSDAY");break;
}
}
}