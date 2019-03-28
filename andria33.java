import java.awt.*;
import java.applet.*;
public class andria33 extends Applet
{
String s;
Image i;
public void init()
{
s="java is interesting";
i=getImage(getCodeBase(),"img18.jpg");
}
public void paint(Graphics g)
{
g.drawImage(i,20,20,this);
Font f=new Font("Georgia",Font.ITALIC,30);
g.setFont(f);
g.setColor(Color.white);
//setBackground(Color.red);
g.drawString(s,200,200);
}
}