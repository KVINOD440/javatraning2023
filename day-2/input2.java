import java.util.Scanner;
class input2{
public static double div(int x,int y)
{
int c=x+y;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("Enter a number-1\n");
int num1;
num1=scob.nextInt();
System.out.println("Enter a number-2");
int num2;
num2=scob.nextInt();
System.out.println(num1+"+"+num2+"="+div(num1,num2));
}
}

