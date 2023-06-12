class animal2{
public void move()
{
System.out.println("Animals can move");
}
}
class dog extends animal2
{
public void move()
{
System.out.println("dogs can walk and run");
}
}
class testdog
{
public static void main(String args[])
{
animal2 a=new animal2();
 animal2 b=new dog();
a.move();
b.move();
}
}
