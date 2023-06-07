class student7
{
int rollno;
String name,course;
float fee;
student7(int rollno, String name,String course)
{
this.rollno=rollno;
this.name=name;
this.course=course;
}
student7(int rollno,String name, String course,float fee)
{
this(rollno,name,course);
this.fee=fee;
}
void display()
{
System.out.println(rollno+""+name+""+course+""+fee);
}
}
class testthis3
{
public static void main(String args[])
{
student7 s1=new student7(440,"vinod","java");
student7 s2=new student7(446,"pavan","java");
s1.display();
s2.display();
}
}