class employee
{
float salary=400000;
}
class programmer extends employee
{
int bonus=100000;
public static void main(String args[])
{
programmer p=new programmer();
System.out.println("programmer salary is:"+p.salary);
System.out.println("Bonous of programmer is:"+p.bonus);
}
}`