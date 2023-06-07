class AB{
AB()
{
System.out.println("hello a");
}
AB(int x)
{
this();
System.out.println(x);
}
}
class testthis5
{
public static void main(String args[])
{
AB a=new AB(10);
}
}