import java.util.*;
class d10p6secondlargest
{
public static void main(String[] args)
{
int n,i=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int sum=0;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
sum+=a[i];
}
Arrays.sort(a);
int sl=0;
for(int j=0;j>n-1;j++)
{
if(a[j]<a[n-1])
{
sl=a[j];
System.out.print(sl);
}
}
}
}