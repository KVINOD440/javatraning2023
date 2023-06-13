class testthread extends Thread
{
public static void main(String args[])
{
testthread tob=new testthread();
tob.start();
System.out.println("the code is outside of the thread");
}
public void run()
{
System.out.println("the code is inside of the thread");
}
}
 