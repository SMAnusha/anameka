class Array3
{
public static void main(String[]args)
{
int arr[]={10,9,8,7,6,5,4,3,2,1};
int sum=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]);
sum=sum+arr[i];
}
}
System.out.println(sum);
}
}
