import java.awt.*;
import java.applet.*;
public class andria36 extends Applet
{
String s;
int x1,y1,x2,y2;
public boolean mouseDown(Event e,int x,int y)
{
x1=x;
y1=y;
repaint();
return true;
}
public boolean mouseUp(Event e,int x,int y)
{
x2=x;
y2=y;
repaint();
return true;
}
public boolean mouseDrag(Event e,int x,int y)
{
x2=x;
y2=y;
repaint();
return true;
}
public void init()
{
s="Andria";
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawRect(x1,y1,x2-x1,y2-y1);
g.drawString("("+x1+","+y1+")",x1-1,y1-1);
g.drawString("("+x2+","+y2+")",x2+1,y2+1);
Font f=new Font("Georgia",Font.ITALIC,25);
FontMetrics fm=getFontMetrics(f);
int x=(x2+x1-fm.stringWidth(s))/2;
int y=(y2+y1)/2;
g.setFont(f);
g.drawString(s,x,y);
}
}