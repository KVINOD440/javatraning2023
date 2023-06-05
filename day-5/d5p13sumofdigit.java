import java.util.*;
public class d5p13sumofdigit
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum;
for(sum=0;num>0;num=num/10)
sum=sum+num%10;
System.out.println("The sum of a digits of a number is "+sum);
}
}