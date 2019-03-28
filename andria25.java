import java.awt.event.*;
import java.awt.*;
class andria25 extends Frame implements ActionListener
{
Label l1,l2,l3;
Button b1,b2,b3,b4;
TextField t1,t2,t3;
public static void main(String a25[])
{
andria25 w=new andria25(a25[0]);
}
public andria25(String m)
{
setLayout(new GridLayout(3,1));
Panel p1=new Panel();
p1.setLayout(new GridLayout(2,2));
l1=new Label("Number 1");
p1.add(l1);
t1=new TextField(20);
p1.add(t1);
l2=new Label("Number 2");
p1.add(l2);
t2=new TextField(20);
p1.add(t2);
add("North",p1);
Panel p2=new Panel();
p2.setLayout(new GridLayout(1,4));
b1=new Button("+");
b2=new Button("-");
b3=new Button("*");
b4=new Button("/");
p2.add(b1);
b1.addActionListener(this);
p2.add(b2);
b2.addActionListener(this);
p2.add(b3);
b3.addActionListener(this);
p2.add(b4);
b4.addActionListener(this);
add("Center",p2);
Panel p3=new Panel();
p3.setLayout(new GridLayout(1,1));
l3=new Label("Result");
p3.add(l3);
t3=new TextField(20);
p3.add(t3);
add("South",p3);
//setSize(400,200);
pack();
setVisible(true);
setLocation(200,50);
setResizable(false);
setTitle(m);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String s1=t1.getText();
String s2=t2.getText();
int x,y,z;
String m;
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);
z=x+y;
m=String.valueOf(z);
t3.setText(m);
}
else if(e.getSource()==b2)
{
String s1=t1.getText();
String s2=t2.getText();
int x,y,z;
String m;
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);
z=x-y;
m=String.valueOf(z);
t3.setText(m);
}
else if(e.getSource()==b3)
{
String s1=t1.getText();
String s2=t2.getText();
int x,y,z;
String m;
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);
z=x*y;
m=String.valueOf(z);
t3.setText(m);
}
else if(e.getSource()==b4)
{
String s1=t1.getText();
String s2=t2.getText();
int x,y;
float z;
String m;
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);
z=x/y;
m=String.valueOf(z);
t3.setText(m);
}
}
}