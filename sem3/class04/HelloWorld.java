import java.applet.Applet;
import java.awt.Graphics;

// <applet code=HelloWorld width=300 height=150></applet>

public class HelloWorld extends Applet{
    @Override
    public void paint(Graphics g){
        g.drawString("Hello World", 20, 20);
    } 
}