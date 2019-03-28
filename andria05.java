class andria05
{
public static void main(String a5[])
{
int h;
h=Integer.parseInt(a5[0]);
andria05 w=new andria05();
w.factorial(h);
}

void factorial(int a)
{
int i,s=1;
for(i=a;i>0;i--)
{
s*=i;
}
System.out.print(s);
}
}