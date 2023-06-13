class Frist implements Runnable
{
Thread t;
Frist()
{
t=new Thread(this,"NEW");
System.out.println("CHILD:"+t);
t.start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("Child:"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e){}
System.out.println("Exiting child");
}
}
class seconds
{
	public static void main(String []args)throws Exception{
		new Frist();
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println("main"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
		System.out.println("Exiting main");
	}
}