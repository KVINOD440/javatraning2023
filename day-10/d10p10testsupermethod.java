class person
{
int id;
String name;
person(int id,String name)
{
this.id=id;
this.name=name;
}
}
class emp extends person{
float salary;
emp(int id,String name,float salary)
{
super(id,name);
this.salary=salary;
}
void display()
{
System.out.print(id+" "+name+" "+salary);
}
}
class testsupermethod
{
public static void main(String args[])
{
emp e1=new emp(101,"ram",2500.5f);
e1.display();
}
}
