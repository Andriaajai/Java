import java.awt.*;
import java.applet.*;
public class andria37 extends Applet
{
String s;
int a[][],i=0;
public boolean mouseDown(Event e,int x,int y)
{
a[i][0]=x;
a[i][1]=y;
repaint();
return true;
}
public boolean mouseUp(Event e,int x,int y)
{
a[i][2]=x;
a[i][3]=y;
repaint();
i++;
return true;
}
public boolean mouseDrag(Event e,int x,int y)
{
a[i][2]=x;
a[i][3]=y;
repaint();
return true;
}
public void init()
{
s="Andria";
}
public void paint(Graphics g)
{
int d;
for(d=0;d<i;d++)
{
g.setColor(Color.red);
g.drawRect(a[d][0],a[d][1],a[d][2]-a[d][0],a[d][3]-a[d][1]);
g.drawString("("+a[d][0]+","+a[d][1]+")",a[d][0]-1,a[d][1]-1);
g.drawString("("+a[d][2]+","+a[d][3]+")",a[d][2]+1,a[d][3]+1);
Font f=new Font("Georgia",Font.ITALIC,25);
FontMetrics fm=getFontMetrics(f);
int x=(a[d][2]+a[d][0]-fm.stringWidth(s))/2;
int y=(a[d][3]+a[d][1])/2;
g.setFont(f);
g.drawString(s,x,y);
}
}
}