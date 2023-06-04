class Rectangle{
int length;
int width;
void insert(int l,int w)
{
length=l;
width=w;
}
void calarea()
{
System.out.println("the recatangle length is "+length+" and width is "+width+" and area is "+length*width);
}
}
class Testrectangle{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(11,5);
r2.insert(15,9);
r1.calarea();
r2.calarea();
}
}