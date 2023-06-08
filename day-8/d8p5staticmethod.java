class student1
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="MTIET";
}
student1(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
 class TestStaticMethod
{ public static void main(String args[])
{
student1.change();
student1 s1=new student1(101,"Ram");
student1 s2=new student1(102,"Rao");
student1 s3=new student1(103,"Raj");
s1.display();
s2.display();
s3.display();
}
}