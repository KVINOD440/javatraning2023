import java.util.Scanner;
class input4{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("input\n");
double num1;
num1=scob.nextDouble();
double num2;
num2=scob.nextDouble();
System.out.print("output\n");
int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.print(num1+"\n"+num2);
}
}