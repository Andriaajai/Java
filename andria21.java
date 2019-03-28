import java.awt.*;
class andria21 extends Frame
{
Label l1,l2,l3;
Button b1,b2;
TextField t1,t2;
public static void main(String a21[])
{
andria21 w=new andria21(a21[0]);
}
public andria21(String m)
{
//setLayout(new FlowLayout());
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(false);
setTitle(m);
l1=new Label("Login Window");
Panel p1=new Panel();
p1.add(l1);
add("North",p1);
Panel p3=new Panel();
p3.setLayout(new FlowLayout(2));
b1=new Button("Close");
b2=new Button("Login");
p3.add(b1);
p3.add(b2);
add("South",p3);
Panel p2=new Panel();
p2.setLayout(new GridLayout(2,2));
l2=new Label("User ID");
l3=new Label("Password");
t1=new TextField(20);
t2=new TextField(20);
t2.setEchoChar('*');
p2.add("West",l2);
p2.add("East",t1);
p2.add("West",l3);
p2.add("East",t2);
add("Center",p2);
}
}
