class Parallel
{
double area()
{
float b=367.3f, h=86.9f;
double res=b*h;
return res;
}
}
class Parallelstatic
{
public static void main(String[]args)
{
Parallel a= new Parallel();
double j=a.area();
System.out.println(j);
}
}