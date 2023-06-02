import java.util.Scanner;
class input4{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("Enter a number-1\n");
double num1;
num1=scob.nextDouble();
System.out.println("Enter a number-2");
double num2;
num2=scob.nextDouble();
System.out.println(num1+"+"+num2+"="+(num1+num2));
}
}