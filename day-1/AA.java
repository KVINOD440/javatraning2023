class AA{
public static void main(){
System.out.println("Main method without argument called.");
}
public static void main(String args[]){
System.out.println("AA is typing...");
main();
main(20);
}
public static void main(int x){
System.out.println("Main method without argument called"+x*2);
}
}