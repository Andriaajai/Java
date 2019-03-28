import java.awt.*;
class andria13 extends Frame
{
Button b1,b2,b3,b4,b5;
public static void main(String a13[])
{
andria13 w=new andria13(a13[0]);
}
public andria13(String m)
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
b4=new Button("North");
b5=new Button("Centre");
add("East",b1);
add("West",b2);
add("South",b3);
add("North",b4);
add("Center",b5);
}
}