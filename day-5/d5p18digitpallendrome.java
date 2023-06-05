import java.util.*;
public class d5p18digitpallendrome
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int rd;
for(rd=0;num>0;num=num/10)
{
rd=rd*10+(num%10);
}
System.out.println("The reverse of a number is "+rd);
if(num==rd)
System.out.println(num+" is a pallendrome");
else
System.out.println(num+" is not a pallendrome");
}
}