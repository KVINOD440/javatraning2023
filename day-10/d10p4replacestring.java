import java.util.*;
 class d10p4replacestring{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String c=s.nextLine();
String c1=s.nextLine();
String res=str.replaceAll(c,c1);
System.out.print(res);
}
}
