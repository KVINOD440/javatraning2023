class student6
{
int id;
String name;
student6(int i,String n)
{
id=i;
name=n;
}
student6(student6 s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.print(id+""+name);
}
public static void main(String args[])
{
student6 s1=new student6(446,"pavan");
student6 s2=new student6(s1);
s1.display();
s2.dispaly();
}
}