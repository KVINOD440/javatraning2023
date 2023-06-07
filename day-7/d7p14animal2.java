class animal
{
void eat()
{
System.out.println("eating....");
}
}
class BabyDog extends animal{
void bark()
{
System.out.println("Weeping....");
}
}
class TestInheritance2{
public static void main(String args[])
{
BabyDog d=new BabyDog();
d.bark();
d.eat();
}
}
