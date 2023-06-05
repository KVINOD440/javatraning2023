import java.util.*;
class d5p11factorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any positive integer:");
int a=sc.nextInt();
int result=1;
for(int i=1;i<=a;i++)
result*=i;
System.out.println("factorial of a number is:"+result);
}
}
