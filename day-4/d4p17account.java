class account
{
int accno;
String name;
float amount;
void insert(int a,String n,float amt)
{
accno=a;
name=n;
amount=amt;
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println(amt+"Deposited");
}
void withdraw(float amt)
{
if(amount<amt)
{
System.out.println("Insfficient funds");
}
else
{
amount=amount-amt;
System.out.println(amt+"withdrewed");
}
}
void checkbalance()
{
System.out.println("Avalable balance is "+amount);
}
void display()
{
System.out.println("Account number: "+accno+" Name: "+name+" available balance:"+amount);
}
}
class Testaccount{
public static void main(String args[])
{
account a1=new account();
a1.insert(401,"pavan",50000);
a1.deposit(30000);
a1.withdraw(2000);
a1.checkbalance();
a1.display();
}
}