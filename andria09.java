class andria09
{
int no;
String name;
public static void main(String a9[])
{
andria09 w=new andria09(a9[0],a9[1]);
w.print();
w.add(12);
w.print();
}
public andria09(String x,String y)
{
tools d=new tools();
d.show();
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
class tools
{
void show()
{
System.out.println("hello how are you");
}
}