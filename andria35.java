import java.awt.*;
import java.applet.*;
public class andria35 extends Applet
{
String s;
public void init()
{
s="java is interesting";
}
public void paint(Graphics g)
{
Font f=new Font("Georgia",Font.ITALIC,25);
FontMetrics fm=getFontMetrics(f);
int x=(getSize().width-fm.stringWidth(s))/2;
int y=getSize().height/2;
g.setFont(f);
g.setColor(Color.white);
setBackground(Color.red);
g.drawString(s,x,y);
}
}