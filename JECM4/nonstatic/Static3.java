class Nonstatic
{
void area()
{
int a=60, b=200;
double h=76.8;
double res=0.5*(a+b)*h;
System.out.println(res);
}
}
class Static3
{
public static void main(String[]args)
{
Nonstatic x=new Nonstatic();
x.area();
}
}