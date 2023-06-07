class c {
public void disp()
{
System.out.println("method of class c");
}
}
class a extends c
{
public void display()
{
System.out.println("Method of of class a");
}
}
class b extends c
{
public void display()
{
System.out.println("Method of of class b ");
}
}
class d extends a
{
public void display()
{
System.out.println("Method of of class d ");
}
public static void main(String args[])
{
d ob=new d();
ob.disp();
}
}