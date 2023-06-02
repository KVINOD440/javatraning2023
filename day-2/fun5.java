  import java.util.*;
class fun5{
static int diff(int x,int y)
{return x-y;}
static int product(int x,int y)
{return x*y;}
static int smallest(int x,int y)
{if(x<y)return x;
if(y<x)return y;
return 0;}
static int largest(int x,int y)
{if(x>y)return x;
if(y>x)return y;
return 0;}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("Enter a number-1\n");
int num1;
num1=scob.nextInt();
System.out.print("Enter a number-2\n");
int num2;
num2=scob.nextInt(); 
int result;
result=diff(num1,num2);
System.out.println("Difference is"+result);
result=product(num1,num2);
System.out.println("product is"+result);
result=smallest(num1,num2);
System.out.println("smallest number is"+result);
result=largest(num1,num2);
System.out.println("largest number is"+result);
}
}
