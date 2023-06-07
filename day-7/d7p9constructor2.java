class  student5
{
int id;
String name;
int age;
student5(int i,String n)
{
id=i;
name=n;
}
student5(int i,String n,int a)
{
i=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
student5 s1=new student5(446,"pavan");
student5 s2=new student5(442,"Vinutha");
s1.display();
s2.display();
}
}