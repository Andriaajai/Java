import java.awt.*;
class andria17 extends Frame
{
Button b1,b2,b3,b4,b5,b44;
public static void main(String a17[])
{
andria17 w=new andria17(a17[0]);
}
public andria17(String m)
{
//setLayout(new FlowLayout(0));
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(true);
setTitle(m);
b1=new Button("East");
b2=new Button("West");
b3=new Button("South");
b4=new Button("North1");
b44=new Button("North2");
b5=new Button("Centre");
Panel p1=new Panel();
p1.setLayout(new BorderLayout());
add("East",b1);
add("West",b2);
add("South",b3);
p1.add("West",b4);
p1.add("East",b44);
add("North",p1);
add("Center",b5);
}
}