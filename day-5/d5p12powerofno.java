import java.util.*;
class d5p12powerofno{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a base number");
int a=sc.nextInt();
System.out.println("Enter a power number");
int b=sc.nextInt();
int result=1;
for(int i=1;i<=b;i++)
{
result=a*result;
}
System.out.println(a+" power "+b+" is "+result);
}
}