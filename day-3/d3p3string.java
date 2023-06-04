public class d3p3string
{
public static void main(String args[])
{
String s1="allu ";
String s2="allu ";
String s3=new String("aLlu ");
String s4="allu ";
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equals(s4));
}
}