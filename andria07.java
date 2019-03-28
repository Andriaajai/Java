class andria07
{
int no;
public static void main(String a7[])
{
andria07 w=new andria07(a7[0]);
w.print();
w.add(34);
w.print();
}
public andria07(String x)
{
int t;
t=Integer.parseInt(x);
no=t;
}
void add(int r)
{
no+=r;
}
void print()
{
System.out.println(no);
}
}