import java.util.*;
class d6p6largestno{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
int b=scob.nextInt();
int c=scob.nextInt();
int max;
if(a>b){
if(a>c)max=a;
else max=c;}
else{
if(b>c)max=b;
else max=c;}
System.out.print("gretest no is "+max);
}
}
