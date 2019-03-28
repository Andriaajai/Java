import java.awt.*;
import java.applet.*;
public class andria32 extends Applet
{
Image i;
public void init()
{
i=getImage(getCodeBase(),"img18.jpg");
}
public void paint(Graphics g)
{
g.drawImage(i,100,100,this);
}
}
