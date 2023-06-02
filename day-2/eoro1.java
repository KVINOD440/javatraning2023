  import java.util.*;
class eoro1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("Enter a number\n");
int num;
num=scob.nextInt();
if((num/2)*2==num)
{
System.out.print(num+" is Even");
}
else{
System.out.print(num+" is Odd");
}
}
}