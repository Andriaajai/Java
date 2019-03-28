import java.awt.*;
class andria16 extends Frame
{
Button b1,b2,b3,b4,b5,b44,b444;
public static void main(String a16[])
{
andria16 w=new andria16(a16[0]);
}
public andria16(String m)
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
b444=new Button("North3");
b5=new Button("Centre");
Panel p1=new Panel();
add("East",b1);
add("West",b2);
add("South",b3);
p1.add(b4);
p1.add(b44);
p1.add(b444);
add("North",p1);
add("Center",b5);
}
}