class Tester
{
int r=10;
}
class Tista extends Tester
{
void uliya()
{
System.out.println("HI Hello");
}
}
class CTC3
{
public static void main(String[]args)
{
System.out.println("upcasting");
Tester t1=new Tista();
System.out.println(t1.r);
System.out.println("downcasting");
Tista t2=(Tista)t1;
t2.uliya();
System.out.println(t2.r);
}
}