class emp
{
int id;
String name;
address address;
public emp(int id,String name,address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display()
{
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String args[])
{
address address1=new address("palamaner","AP","india");
emp e1=new emp(101,"rao",address1);
e1.display();
}
}

