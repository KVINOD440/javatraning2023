class animal
{
void eat(){System.out.print("Eating.....");
}
}
class dog extends animal
{
void eat(){System.out.print("Eating bread....");}
void bark(){ System.out.print("barking....");}
void work()
{
super.eat();
bark();
}
}
class testsuperclass2
{
public static void main(String args[])
{
dog d=new dog();
d.work();
}
}

