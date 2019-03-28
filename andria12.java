class andria12 extends tools
{
int no;
String name;
public static void main(String a12[])
{
andria12 w=new andria12(a12[0],a12[1]);
w.print();
w.add(12);
w.print();
w.show();
}
public andria12(String x,String y)
{ 
super("92","andria");
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
int quantity;
String itemname;
public tools(String m,String n)
{
int t;
t=Integer.parseInt(m);
quantity=t;
itemname=n;
}
void show()
{
System.out.println(quantity);
System.out.println(itemname);
}
}