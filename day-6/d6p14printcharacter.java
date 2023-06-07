import java.util.*;
public class d6p14printcharacter{
public static void printastar(int k,char c)
{
for(int i=1;i<=k;i++)
System.out.println(c);

}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
char ch=scob.next().charAt(0);
printastar(a,ch);
}
}