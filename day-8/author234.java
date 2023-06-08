class author
{
String aname;
int age;
String place;
author(String name,int age,String place)
{
this.aname=name;
this.age=age;
this.place=place;
}
}
class book
{
String name;
int price;
author author;
book(String n,int p,author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String args[])
{
author author=new author("jhon",42,"USA");
book b=new book("java for begginer",800,author);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("_____AUTHOR DETAILS_____");
System.out.println("Author name:"+author.aname);
System.out.println("Author age:"+author.age);
System.out.println("Author place:"+author.place);
}
}
