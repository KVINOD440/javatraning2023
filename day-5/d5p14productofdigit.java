import java.util.*;
public class d5p14productofdigit
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int prod;
for(prod=1;num>0;num=num/10)
{
prod=prod*(num%10);
}
System.out.println("The product of a digits of a number is "+prod);
}
}