import java.applet.*; 
import java.awt.*; 
//<applet code=student1 width=300 height=150> </applet> 
public class student1 extends Applet {
    public void paint(Graphics g) { 
        g.setColor(Color.blue); 
        this.setBackground(Color.red); 
        Font f=new Font("arial", Font.BOLD, 30); 
        g.setFont(f); 
        g.drawString("dear student", 25, 50); 
        g.drawString("naya raipur", 25, 150); 
    } 
}