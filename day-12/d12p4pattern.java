import java.util.*;
class d12p4pattern
{
	public static void printpattern(int n)
{
for(int i=1;i<=n;i++)
{
System.out.println();
printLine(i);
}
}
public static void printLine(int n)
{
	for(int i=1;i<=n;i++)
		System.out.print(i);
}
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        printpattern(a); 
	}
}
