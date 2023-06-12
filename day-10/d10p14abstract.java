abstract class bike
{
abstract void run();
}
class honda4 extends bike{
void run()
{
System.out.println("Running safely");
}
public static void main(String args[])
{
bike ob=new honda4();
ob.run();
}
}