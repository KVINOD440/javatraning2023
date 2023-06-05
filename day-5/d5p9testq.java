import java.util.*;
class d5p9testq{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String str="";
int i=1;
while(i<=a)
{
i=i+b;
str=str+i+",";
}
while(i<str.length()-1)
{
i++;
System.out.print(str.charAt(i));
}
}
}
