class student7
{
int id;
String name;
student7(int i,String n)
{
id=i;
name=n;
}
student7(){}
void display()
{
System.out.println(id+"  "+name);
}
public static void main(String args[])
{
student7 s1=new student7(446,"pavan");
student7 s2=new student7();
s2.id=s1.id;
s2.name=s1.name;
s1.display(); 
s2.display();
}
}