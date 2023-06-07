import java.util.*;
 class d6p2printpallindrome{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
for(int i=10;i<100000000;i++)
{
int num=i;
int temp=num;
int rd;
for(rd=0;num>0;num=num/10)
{
rd=rd*10+(num%10);
}
if(rd==temp)
{
System.out.print(temp+" ");
}
}
}
}