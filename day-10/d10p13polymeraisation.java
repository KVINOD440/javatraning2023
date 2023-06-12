class animal3{
public void move()
{
System.out.println("call from animal class");
}
}
class wild extends animal3
{
public void move()
{
System.out.println("callfrom wild class");
}
}
class pet extends animal3
{
public void move()
{
System.out.println("call from pet class");
}
}
class testanimal1
{
public static void main(String args[])
{
animal3 a=new animal3();
animal3 w=new wild();
animal3 p=new pet();
a.move();
w.move();
p.move();
}
} 