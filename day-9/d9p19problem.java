import java.util.*;
public class problem{
public static void printastar(int k,char c)
{
for(int i=1;i<=k;i++){
System.out.println();
for(int x=1;x<=k-i;x++)
System.out.print("#");
for(int j=1;j<=i;j++)
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