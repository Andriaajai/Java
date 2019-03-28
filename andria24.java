import java.awt.*;
class andria24 extends Frame
{
Button b1,b2;
TextField t1,t2,t3;
public static void main(String a24[])
{
andria24 w=new andria24(a24[0]);
}
public andria24(String m)
{
setLayout(new FlowLayout());
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(false);
setTitle(m);
t1=new TextField(20);
add(t1);
t1.setText("helloo");
}
}