class d9p13avarageofarrayele
{
public static void main(String args[])
{
int[] numbers={12,4,5};
int sum=0;
System.out.print("avarage of array elements:");
for(int number:numbers)
{
sum+=number;
}
int arraylength=numbers.length;
double avarage=sum/arraylength;
System.out.print(avarage);
}
}