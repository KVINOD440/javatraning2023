class animal
{
animal(){System.out.print("Animal is created");
}
}
class dog extends animal
{
dog(){
super();
System.out.print("dog is created");
}
}
class testsuperclass3
{
public static void main(String args[])
{
dog d=new dog();
}
}
