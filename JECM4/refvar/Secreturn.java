class Secreturn
{
double area()
{
double r=76.8, t=87.68d;
double res=0.5*r*r*t;
return res;
}
public static void main(String[]args)
{
Secreturn m1=new Secreturn();
double y=m1.area();
System.out.println(y);
}
}