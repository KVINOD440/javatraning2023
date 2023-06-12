abstract class bike3{
bike3()
{
System.out.println("bike is created");
}
abstract void run();
void changegear()
{
System.out.println("gear changed");
}
}
class honda6 extends bike3{
void run()
{
System.out.println("running safely");
}
}
class testabstraction6
{ 
public static void main(String args[])
{
bike3 ob=new honda6();
ob.run();
ob.changegear();
}
}