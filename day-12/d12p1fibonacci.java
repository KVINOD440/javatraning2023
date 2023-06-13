import java.util.*;
class d12p1fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a=0;
		int b=1;
		System.out.println("Enter the nth value:");
				int n=sc.nextInt();
		System.out.println("Fibonaci series is ");
		while(sum<=n)
		{
			System.out.print(sum+" ");
			a=b;
			b=sum;
			sum=a+b;
		}
	}
}