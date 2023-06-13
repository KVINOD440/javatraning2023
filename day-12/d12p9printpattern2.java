import java.util.*;
class d12p9printpattern2
{
	public static void printline(char ch1,int nhash,char ch2,int nstar)
	{
		for(int i=0;i<nhash;i++)System.out.print(ch1);
		for(int i=0;i<nstar;i++)System.out.print(ch2);
		for(int i=0;i<nhash;i++)System.out.print(ch1);
	}
	public static void printupperpattern(int n,char ch)
	{
		int i,j;
		for(i=n/2,j=1;i>0&&j<n;i--,j+=2)
		{
			printline('#',i,ch,j);
			System.out.println();
		}
	}
		public static void printlowerpattern(int n,char ch)
	{
		int i,j;
		for(i=0,j=n;i<=n/2&&j>=1;i++,j-=2)
		{
			printline('#',i,ch,j);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch=sc.next().charAt(0);
		printupperpattern(n,ch);
		printlowerpattern(n,ch);
	}
}
		
		