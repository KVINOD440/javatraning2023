public class d3p13char
{
public static void main(String args[])
{
String str="welcome to java";
int strLength=str.length();

for(int i=0;i<=str.length()-1;i++)
{
if(i%2!=0)
{
System.out.println("Character at "+i+" place is "+str.charAt(i));
}
}
}
}