class andria03
{
public static void main(String a3[])
{
int i=0,x,b,r,g,v=0,u;
b=Integer.parseInt(a3[0]);
x=b;
while(b>0)
{
i++;
b=b/10;
}
for(u=0;u<i;u++)
{
if(x>0)
{
r=x%10;
g=pow(2,u);
v+=r*g;
x=x/10;
}
}
System.out.print(v);
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