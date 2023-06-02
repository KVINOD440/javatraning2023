import java.util.Scanner;
class dayno2{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("input\n");
int dn;
dn=scob.nextInt();
System.out.print("output\n");

if(dn==0) System.out.println("SUNDAY");
else if(dn==1) System.out.println("MONDAY");
else if(dn==2) System.out.println("TUESDAY");
else if(dn==3) System.out.println("WEDNESDAY");
else if(dn==4) System.out.println("THRUDAY");
else if(dn==5) System.out.println("FRIDAY");
else if(dn==6) System.out.println("SATURDAY");
else System.out.println("INVALID"); 
}
}