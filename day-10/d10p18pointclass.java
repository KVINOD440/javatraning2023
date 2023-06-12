class point
{
double x;
double y;
public void setx(double xvalue)
{ x=xvalue;}
public void setx(double yvalue)
{ y=yvalue;}
public double getx(){return x;}
public double gety(){return y;}
public double sqruaredistancefromorigin()
{
return x*y+x*y;
} 
public static void main(String args[])
{
	point p=new point();
	p.setx(5.0D);
	p.sety(3.8D);
	System.out.print(p.sqruaredistancefromorigin());
}
}
