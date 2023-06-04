import java.util.*;
class d4p2testq{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String str="";
for(int i=0;i<=a;i=i+b)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
System.out.print(str.charAt(i));
}
}
