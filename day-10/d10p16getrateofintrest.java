abstract class bank{
abstract int getrateofintrest();
}
class SBI extends bank
{
int getrateofintrest()
{
return 7;
}
}
class PNB extends bank
{
int getrateofintrest()
{
return 8;
}
}
class testbank
{
public static void main(String args[])
{
bank b;
b=new SBI();
System.out.println("Rate of intrest is:"+b.getrateofintrest()+"96");
b=new PNB();
System.out.println("Rate of intrest is:"+b.getrateofintrest()+"96");
}
}


