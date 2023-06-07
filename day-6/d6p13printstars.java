import java.util.*;
public class d6p13printstars{
public static void printastar(int k)
{
for(int i=1;i<=k;i++)
System.out.print("*");

}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
printastar(a);
}
}