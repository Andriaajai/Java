import java.awt.*;
import java.applet.*;
public class andria34 extends Applet
{
String s;
public void init()
{
s="java is interesting";
}
public void paint(Graphics g)
{
Font f=new Font("Georgia",Font.ITALIC,30);
g.setFont(f);
g.setColor(Color.white);
setBackground(Color.red);
g.drawString(s,200,200);
}
}