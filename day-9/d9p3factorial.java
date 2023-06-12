//example of recursive function
import java.util.*;
class d9p3factorial
{
public static int calculatefactorial(int n )
{
if(n==0) return 1;
else return n*calculatefactorial(n-1);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num<0) System.out.println("INVALID");
else 
System.out.println(calculatefactorial(num));
}
}