import java.util.*;
class d9p5amstrong
{
public static int lendigit(int n)
{
int len=0;
while(n>0)
{
len++;
n=n/10;
}
return len;
}

public static boolean checkamstrong(final int n)
{
int sum=0;
int exp=lendigit(n);
int num=n;
while(num>0)
{
sum+=Math.pow((num%10),exp);
num=num/10;
}
return n==sum;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inum=sc.nextInt();
if(checkamstrong(inum))
System.out.print("YES");
else System.out.println("NO");
}
}
