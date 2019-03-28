import java.awt.*;
class andria15 extends Frame
{
Label b1,b2,b3,b4,b5;
public static void main(String a15[])
{
andria15 w=new andria15(a15[0]);
}
public andria15(String m)
{
setLayout(new FlowLayout(0));
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(true);
setTitle(m);
b1=new Label("click me");
b2=new Label("click me");
b3=new Label("click me");
b4=new Label("click me");
b5=new Label("click me");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
}
}