import java.util.*;
class d9p16sortelement1
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
for(i=0;i<a.length;i++)
for(int j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
for(int x:a)
{
System.out.println(x);
}
}
}