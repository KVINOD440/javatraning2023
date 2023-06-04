class stude
{
int rollno;
String name;
stude(){rollno=0;name=null;}
stude(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}
}
class Student5{
public static void main(String args[])
{
stude s1;
s1=new stude();
stude s2=new stude(440,"vinod");
s1.displayinformation();
s2.displayinformation();
}
}