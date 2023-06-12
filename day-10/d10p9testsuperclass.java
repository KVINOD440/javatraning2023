class animal
{
animal(){System.out.print("Animal is created");
}
}
class dog extends animal
{
dog(){
System.out.print("dog is created");
}
}
class testsuperclass4
{
public static void main(String args[])
{
dog d=new dog();
}
}
