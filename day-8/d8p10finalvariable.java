class bike9
{
final int speedlimit=90;
void run()
{
speedlimit=400; /*error: cannot assign a value to final variable speedlimit (speedlimit=400;)*/
System.out.println(speedlimit);
}
public static void main(String args[])
{
bike9 obj=new bike9();
obj.run();
}
}