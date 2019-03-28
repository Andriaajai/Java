class andria08
{
int no;
String name;
public static void main(String a8[])
{
andria08 w=new andria08(a8[0],a8[1]);
w.print();
w.add(12);
w.print();
}
public andria08(String x,String y)
{
int t;
t=Integer.parseInt(x);
no=t;
name=y;
}
void add(int r)
{
no+=r;
}
void print()
{
System.out.println(no);
System.out.println(name);
}
}