class stu
{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}
}
class Student4{
public static void main(String args[])
{
stu ob=new stu();
stu s1=new stu();
stu s2=new stu();
s1.insertRecord(440,"vinod");
s2.insertRecord(446,"pavan");
s1.displayinformation();
s2.displayinformation();
}
}