import java.awt.*;
class andria26 extends Frame
{
TextField t1,t2,t3;
public static void main(String a26[])
{
andria26 w=new andria26(a26[0]);
}
public andria26(String m)
{
setLayout(new FlowLayout());
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(false);
setTitle(m);
t1=new TextField(20);
add(t1);
t1.setText("201");
t2=new TextField(20);
add(t2);
t2.setText("304");
t3=new TextField(20);
add(t3);
String s1=t1.getText();
String s2=t2.getText();
int x,y,z;
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);
z=x+y;
m=String.valueOf(z);
t3.setText(m);
}
}