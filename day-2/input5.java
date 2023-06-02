import java.util.Scanner;
class input5{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("input\n");
int num1;
num1=scob.nextInt();
int num2;
num2=scob.nextInt();
System.out.print("output\n");
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.print(num1+"\n"+num2);
}
}