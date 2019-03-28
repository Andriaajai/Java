import java.awt.*;
class andria19 extends Frame
{
Button b1,b2,b3,b4,b5,b6;
public static void main(String a19[])
{
andria19 w=new andria19(a19[0]);
}
public andria19(String m)
{
setLayout(new GridLayout(3,2));
setSize(300,200);
setVisible(true);
setLocation(200,50);
setResizable(true);
setTitle(m);
b1=new Button("click me");
b2=new Button("click me");
b3=new Button("click me");
b4=new Button("click me");
b5=new Button("click me");
b6=new Button("click me");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
}
}