import java.util.Scanner;
class monthno1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("input\n");
int mn;
mn=scob.nextInt();
System.out.print("output\n");

if(mn==0) System.out.println("JUANARY");
else if(mn==1) System.out.println("FEBURAVARY");
else if(mn==2) System.out.println("MARCH");
else if(mn==3) System.out.println("APRIL");
else if(mn==4) System.out.println("MAY");
else if(mn==5) System.out.println("JUNE");
else if(mn==6) System.out.println("JULY");
else if(mn==7) System.out.println("AUGUST");
else if(mn==8) System.out.println("SEPTEMBER");
else if(mn==9) System.out.println("ACTOBER");
else if(mn==10) System.out.println("NOVEMBER");
else if(mn==11) System.out.println("DECEMBER");
else System.out.println("INVALID"); 
}
}