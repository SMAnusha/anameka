class Trapezoid
{
void area(int a, int h, double b)
{
double res=0.5*(a+b)*h;
System.out.println(res);
}
public static void main(String[]args)
{
Trapezoid z = new Trapezoid();
z.area(77, 89,87.7);
}
}