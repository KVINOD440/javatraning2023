class reactangle1{
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
class Testreactangle1{
public static void main(String args[])
{
reactangle1 r1=new reactangle1(),r2=new reactangle1();
r1.insert(11,5);
r2.insert(15,9);
r1.calarea();
r2.calarea();
}
}