public class d6p5wrapperclass3
{
public static void main(String args[])
{
byte b=10; short s=20; int i=30; long l=23; float f=2333.45F; double d=23.22D; char c='k'; boolean bo=true;
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;  
Double doubleobj=d;
Character charobj=c;
Boolean booleanobj=bo;
System.out.println("Byte object "+byteobj+"\nShort object "+shortobj+"\nInteger object "+intobj+"\nLong object "+longobj+"\nFloat object "+floatobj+"\nDouble object "+doubleobj+"\nCharacter object "+charobj+"\nBoolean object "+booleanobj);
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean booleanvalue=booleanobj;
System.out.println("----printing primitive valu----\nByte value "+bytevalue+"\nShort value "+shortvalue+"\nInteger value "+intvalue+"\nLong value "+longvalue+"\nFloat value "+floatvalue+"\nDouble value "+doublevalue+"\nCharacter value "+charvalue+"\nBoolean value "+booleanvalue);
}
}