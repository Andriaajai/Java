import java.awt.event.*;
import java.awt.*;
class andria23 extends Frame implements ActionListener
{
Button b1,b2;
TextField t1,t2,t3;
public static void main(String a23[])
{
andria23 w=new andria23(a23[0]);
}
public andria23(String m)
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
}
public void actionPerformed(ActionEvent e)
{
System.out.print("hai");
}
}