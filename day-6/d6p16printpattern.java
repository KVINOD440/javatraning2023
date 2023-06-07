import java.util.*;
public class d6p16printpattern{
public static void printastar(int k,char c)
{
for(int i=0;i<=k;i++){
System.out.println();
for(int j=0;j<=i;j++)
System.out.print(c);}

}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
char ch=scob.next().charAt(0);
printastar(a,ch);
}
}