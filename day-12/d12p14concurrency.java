class d12p14concurrency extends Thread
{
	 public static int amount=0;
	 public static void main(String args[])
    {
		 d12p14concurrency thread=new d12p14concurrency();
		 thread.start();
		while(thread.isAlive())
		{
			System.out.println("Wating.....");
		}
		  System.out.println("Main:"+amount);
		  amount++;
		  System.out.println("Main:"+amount);
	}
	 public void run()
	  {
		 amount++;
	  }
}