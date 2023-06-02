  import java.util.*;
class eoro1f{
public static void displayeoro(int a)
{
if((a/2)*2==a)
{
System.out.print(a+" is Even");
}
else{
System.out.print(a+" is Odd");
}
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.print("Enter a number\n");
int num;
num=scob.nextInt();
displayeoro(num);
}
}
