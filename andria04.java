class andria04
{
public static void main(String a4[])
{
int w,i,o=0,x=0,t;
w=a4.length;
for(i=0;i<w;i++)
{
t=Integer.parseInt(a4[i]);
x+=t;
}
check(x);
}
public static void check(int l)
{
int o=0,u;
u=l;
while(l>0)
{
o++;
l=l/10;
}
if(o>1)
{
find(u,o);
}
else
{
System.out.print(u);
}
}
public static void find(int e,int d)
{
int r,v=0;
while(d>0)
{
r=e%10;
v+=r;
e=e/10;
d--;
}
check(v);
}
}