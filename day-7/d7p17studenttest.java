class student{
int roll;
String name;
float fee;
void student(int roll,String name,float fee);
{
this.roll=roll;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(roll+""+name+""+fee);
}
}
class testthis{
public static void main(String args[])
{
student s1=new student(440,"vinod",50000f);
s1.display();
}
}
