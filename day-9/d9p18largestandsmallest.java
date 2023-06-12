import java.util.*;
class d9p18largestandsmallest
{
public static void main(String[] args)
{
int n,i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter no of elements you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter all the element:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println("smallest element is: "+a[0]);
System.out.println("Largest element is:"+a[n-1]);
}
}