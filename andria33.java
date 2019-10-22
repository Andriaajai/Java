import java.awt.*;
import java.applet.*;
class andria33 extends Applet
{
String s;
Image i;
void init()
{
i=getImage(getCodeBase(),"img18.jpg");
}
void paint(Graphics g)
{
g.drawImage(i,20,20,this);
}
}
