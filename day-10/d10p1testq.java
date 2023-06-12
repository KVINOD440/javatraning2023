import java.util.*;
 class d10p1testq{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char ch=s.next().charAt(0);
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)!=ch)
System.out.print(str.charAt(i));
}
}
}
