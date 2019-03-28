class andria01
{
public static void main(String a1[])
{
int w,i,m=0,x,small,large;
x=a1.length;
if(x==0)
{
System.out.print("enter the values to be checked");
}
else
{
small=Integer.parseInt(a1[0]);
large=Integer.parseInt(a1[0]);
for(i=0;i<x;i++)
{
w=Integer.parseInt(a1[i]);
if(w>large)
{
large=w;
}
else if(w<small)
{
small=w;
}
m+=w;
}
System.out.println("sum is "+m);
System.out.println("largest number is "+large);
System.out.println("smallest number is "+small);
}
}
}