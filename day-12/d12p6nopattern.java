import java.util.*;
public class d12p6nopattern
{
public static void printPattern(int n)
{
int i,j;
int num=0;
for(i=1;i<=n/2;i++)
{
for(j=1;j<=i;j++) 
{   
System.out.print(num+" ");
num++;
}
System.out.println();
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPattern(n);
}
}