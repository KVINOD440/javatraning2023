import java.util.*;
class d12p8printpattern
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n/2+1;
		//for printing upper half
		for(int i=1;i<=m;i++)
		{
			for(int j=m-i;j>=1;j--)
			{
				System.out.print("#");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
				for(int j=m-i;j>=1;j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		//for printing lower half
		
			for(int i=m-1;i>=1;i--)
		{
			for(int j=m-i;j>=1;j--)
			{
				System.out.print("#");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
				for(int j=m-i;j>=1;j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}