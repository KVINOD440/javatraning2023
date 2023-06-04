class empolyee
{
int id;
String name;
float salary;
void insert(int i,String n,float s)
{
id=i;
name=n;
salary=s;
}
void display()
{
System.out.println(id+" "+name+" salary is "+salary);
}
}
class Testempolyee{
public static void main(String args[])
{
empolyee e1=new empolyee();
empolyee e2=new empolyee();
empolyee e3=new empolyee();
empolyee e4=new empolyee();
e1.insert(401,"pavan",250000);
e2.insert(402,"chinni",350000);
e3.insert(403,"vinod",950000);
e4.insert(404,"vinutha",850000);
e1.display();
e2.display();
e3.display();
e4.display();
}
}