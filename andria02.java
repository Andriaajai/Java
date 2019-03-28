class andria02
{
public static void main(String a2[])
{
int x=0,m,i=0,b;
b=Integer.parseInt(a2[0]);
while(b>=1)
{
if(b%2==0)
{
m=pow(10,i);
x+=0*m;
b=b/2;
}
else
{
m=pow(10,i);
x+=1*m;
b=(b-1)/2;
}
i++;
}
System.out.print(x);
}
public static int pow(int c,int d)
{
int h=1;
if(d==0)
{
return 1;
}
else
{
while(d>0)
{
h*=c;
d--;
}
return h;
}
}
}