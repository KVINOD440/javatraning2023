import java.util.*;
 class d10p3replaceall{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char ch=s.next().charAt(0);
String c=String.valueOf(ch);
char ch1=s.next().charAt(0);
String c1=String.valueOf(ch1);
String res=str.replaceAll(c,c1);
System.out.print(res);
}
}
