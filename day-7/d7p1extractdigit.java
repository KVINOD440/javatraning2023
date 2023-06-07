import java.util.*;
public class d7p1extractdigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)>='0' && str.charAt(i)<='9')
{
System.out.print(str.charAt(i));
}
}
}
}
