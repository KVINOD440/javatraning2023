class Frist implements Runnable
{
	Thread t;
	String s;
	Frist(String name)
	{
		s=name;
		t=new Thread(this.s);
		System.out.println("child:"+t);
		t.start();
	}
	public void run()
	{
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println(s+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){}
		System.out.println("Exiting:"+s);
	}
}
class second
{
	public static void main(String args[])throws Exception
	{
		new Frist("ONE");
		new Frist("TWO");
		new Frist("THREE");
		try{
			Thread.sleep(20000);
		}
		catch(InterruptedException e){}
		System.out.println("Exit main");
	}
}
		
				