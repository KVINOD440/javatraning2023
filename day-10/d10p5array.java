import java.util.*;
class d10p5array
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
System.out.println("smallest: "+a[0]);
System.out.println("largest: "+a[n-1]);
System.out.println("sum: "+sum);
float avg;
avg=(float)sum/n;
System.out.println("avg: "+avg);
}
}