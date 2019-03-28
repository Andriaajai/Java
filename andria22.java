import java.awt.event.*;
import java.awt.*;
class andria22 extends Frame implements ActionListener
{
Button b1,b2;
TextField t1,t2,t3;
public static void main(String a22[])
{
andria22 w=new andria22(a22[0]);
}
public andria22(String m)
{
setLayout(new FlowLayout());
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(false);
setTitle(m);
b1=new Button("close");
b2=new Button("login");
add(b1);
b1.addActionListener(this);
add(b2);
b2.addActionListener(this);
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
public void actionPerformed(ActionEvent e)
{
System.out.print("hai");
}
}