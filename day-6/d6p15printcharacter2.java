import java.util.*;
public class d6p15printcharacter2{
public static void printastar(int k,char c)
{
for(int i=1;i<=k;i++)
System.out.println(c);

}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
printastar(a,'+');
printastar(a,'-');
printastar(a,'*');

}
}