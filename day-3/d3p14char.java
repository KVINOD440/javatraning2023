public class d3p14char
{
public static void main(String args[])
{
String str="welcome to java";
int strLength=str.length();

for(int i=0;i<=str.length();i++)
{
if(i%2==0)
{
System.out.println("Character at "+i+" place is "+str.charAt(i));
}
}
}
}