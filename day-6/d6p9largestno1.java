import java.util.*;
class d6p9largestno1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
int b=scob.nextInt();
int c=scob.nextInt();
int max;
if(a>b && a>c) max=a;
else 
if(b>a && b>c) max=b;
else max=c;
System.out.print("largestest no is "+max);
}
}
