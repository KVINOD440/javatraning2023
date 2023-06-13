class d12p11priority
{
public static void main(String args[])throws Exception
{
Thread t=Thread.currentThread();
System.out.println("Current thread= "+t);
t.setName("New thread by ram");
t.setPriority(t.getPriority()-1);
System.out.println("Current thread= "+t);
System.out.println("Name= "+t.getName());
}
}