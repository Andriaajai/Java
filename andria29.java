import java.awt.event.*;
import java.awt.*;
class andria29 extends Frame implements ActionListener
{
double gmem=0;
String gsym="";
double mr=0;
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
public static void main(String a29[])
{
andria29 w=new andria29(a29[0]);
}
public andria29(String m)
{
setLayout(new BorderLayout());
Panel p1=new Panel();
t1=new TextField(20);
p1.add(t1);
t1.setText("0");
add("North",p1);
Panel p2=new Panel();
p2.setLayout(new GridLayout(6,4));
b1=new Button("7");
b2=new Button("8");
b3=new Button("9");
b4=new Button("+");
b5=new Button("4");
b6=new Button("5");
b7=new Button("6");
b8=new Button("-");
b9=new Button("1");
b10=new Button("2");
b11=new Button("3");
b12=new Button("*");
b13=new Button("0");
b14=new Button("C");
b15=new Button("=");
b16=new Button("/");
b17=new Button("M+");
b18=new Button("M-");
b19=new Button("MR");
b20=new Button("%");
b21=new Button("SQ");
b22=new Button("SR");
b23=new Button(".");
b24=new Button("OFF");
b25=new Button("CLEAR");
p2.add(b1);
p2.add(b2);
p2.add(b3);
p2.add(b4);
p2.add(b5);
p2.add(b6);
p2.add(b7);
p2.add(b8);
p2.add(b9);
p2.add(b10);
p2.add(b11);
p2.add(b12);
p2.add(b13);
p2.add(b14);
p2.add(b15);
p2.add(b16);
p2.add(b17);
p2.add(b18);
p2.add(b19);
p2.add(b20);
p2.add(b21);
p2.add(b22);
p2.add(b23);
p2.add(b24);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
b24.addActionListener(this);
add("Center",p2);
Panel p3=new Panel();
p3.setLayout(new BorderLayout());
p3.add(b25);
add("South",p3);
b25.addActionListener(this);
//setSize(400,200);
pack();
setVisible(true);
setLocation(200,50);
setResizable(false);
setTitle(m);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
double t,a;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("7");
}
else
{
String v=t1.getText();
String n="7";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b2)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("8");
}
else
{
String v=t1.getText();
String n="8";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b3)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("9");
}
else
{
String v=t1.getText();
String n="9";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b5)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("4");
}
else
{
String v=t1.getText();
String n="4";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b6)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("5");
}
else
{
String v=t1.getText();
String n="5";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b7)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("6");
}
else
{
String v=t1.getText();
String n="6";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b9)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("1");
}
else
{
String v=t1.getText();
String n="1";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b10)
{
Double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("2");
}
else
{
String v=t1.getText();
String n="2";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b11)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("3");
}
else
{
String v=t1.getText();
String n="3";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b13)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
if(t==0)
{
t1.setText("0");
}
else
{
String v=t1.getText();
String n="0";
String h=v+n;
t1.setText(h);
}
}
else if(e.getSource()==b14)
{
double t;
String v=t1.getText();
int length=v.length();
length=length-1;
v=v.substring(0,length);
t1.setText(v);
}
else if(e.getSource()==b20)
{
double p;
String w=t1.getText();
p=Double.parseDouble(w);
double g;
g=p/100;
String h=String.valueOf(g);
t1.setText(h);
}
else if(e.getSource()==b4||e.getSource()==b8||e.getSource()==b12||e.getSource()==b16||e.getSource()==b15)
{
if(gmem==0)
{
String d=t1.getText();
gmem=Double.parseDouble(d);
if(e.getSource()==b4)
{
gsym="+";
}
else if(e.getSource()==b8)
{
gsym="-";
}
else if(e.getSource()==b12)
{
gsym="*";
}
else if(e.getSource()==b16)
{
gsym="/";
}
else 
{
gsym="=";
}
t1.setText("0");
}
else
{
switch( gsym)
{
case "+":String f1=t1.getText();
       double r1;
       r1=Double.parseDouble(f1);
       gmem+=r1;
       t1.setText("0");
       break;
case "-":String f2=t1.getText();
       double r2;
       r2=Double.parseDouble(f2);
       gmem-=r2;
       t1.setText("0");
       break;
case "*":String f3=t1.getText();
       double r3;
       r3=Double.parseDouble(f3);
       gmem*=r3;
       t1.setText("0");
       break;
case "/":String f4=t1.getText();
       double r4;
       r4=Double.parseDouble(f4);
       gmem/=r4;
       t1.setText("0");
       break;
}
if(e.getSource()==b4)
{
gsym="+";
}
else if(e.getSource()==b8)
{
gsym="-";
}
else if(e.getSource()==b12)
{
gsym="*";
}
else if(e.getSource()==b16)
{
gsym="/";
}
else 
{
String x=String.valueOf(gmem);
       t1.setText(x);
       gmem=0;
       gsym="";
}
}
}
else if(e.getSource()==b17)
{
String df=t1.getText();
double w=Double.parseDouble(df);
mr+=w;
}
else if(e.getSource()==b18)
{
String df=t1.getText();
double w=Double.parseDouble(df);
mr-=w;
}
else if(e.getSource()==b19)
{
String u=String.valueOf(mr);
mr=0;
t1.setText(u);
}
else if(e.getSource()==b21)
{
String d=t1.getText();
double p,m;
p=Double.parseDouble(d);
m=p*p;
String l=String.valueOf(m);
t1.setText(l);
}
else if(e.getSource()==b24)
{
System.exit(0);
}
else if(e.getSource()==b25)
{
t1.setText("0");
}
else if(e.getSource()==b23)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
String n=".";
String h=w+n;
t1.setText(h);
}
/*else if(e.getSource()==b22)
{
double t;
String w=t1.getText();
t=Double.parseDouble(w);
double h=sqrt(t);
String l=String.valueOf(h);
t1.setText(l);
}*/
}
}
