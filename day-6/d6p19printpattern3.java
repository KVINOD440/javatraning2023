import java.util.*;
public class d6p19printpattern3{
public static void printastar(int k,char c)
{
System.out.println();
for(int i=0;i<=k;i++)   
System.out.print(c);
}
public static void reversepattern(int n,char c)
{
for(int i=n-1;i>=0;i--)
printastar(i,c);
}
public static void printpattern(int n,char c)
{
for(int i=0;i<=n-1;i++)
printastar(i,c);
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
char ch=scob.next().charAt(0);
if(a%2==0)
{
int x=a/2;
printpattern(x,ch);
reversepattern(x,ch);
}
else{
int x=a/2;
printpattern(x,ch);
reversepattern(x+1,ch);
}
}
}