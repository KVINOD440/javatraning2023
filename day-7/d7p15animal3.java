class animal
{
void eat()
{
System.out.println("eating....");
}
}
class Dog extends animal{
void bark()
{
System.out.println("barking....");
}
}
class Cat extends animal{
void meow()
{
System.out.println("Meowing....");
}
}
class TestInheritance3{
public static void main(String args[])
{
Cat c=new Cat();
c.meow();
c.eat();
Dog d=new Dog();
d.bark();
}
}
