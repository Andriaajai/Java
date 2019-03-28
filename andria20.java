import java.awt.*;
class andria20 extends Frame
{
TextField t1;
public static void main(String a20[])
{
andria20 w=new andria20(a20[0]);
}
public andria20(String m)
{
setLayout(new FlowLayout());
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(true);
setTitle(m);
t1=new TextField(20);
t1.setEchoChar('*');
add(t1);
}
}