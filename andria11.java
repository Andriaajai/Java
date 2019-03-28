class andria11 extends tools
{
int no;
String name;
public static void main(String a11[])
{
andria11 w=new andria11(a11[0],a11[1]);
w.print();
w.add(12);
w.print();
w.show();
}
public andria11(String x,String y)
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
class tools
{
int quantity;
String itemname;
public tools()
{
quantity=10;
itemname="andria";
}
void show()
{
System.out.println(quantity);
System.out.println(itemname);
}
}