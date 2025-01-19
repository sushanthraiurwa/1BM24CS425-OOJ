import java.awt.*;
import java.awt.event.*;

public class Demo  extends Frame{


    public Demo(){

        addWindowListener(new WindowAdapter(){
 public void windowClosing(WindowEvent we){
    System.exit(0);
 }
        }
        
        
        );
    }

    public void paint(Graphics g){
        //g.drawLine(40,90,100,90);
        //g.drawRect(40,90,100,90);

        int xponits[]={80,60,100};
        int ypointes[]={60,80,80};
        //g.drawPolygon(xponits,ypointes,3);
        g.setColor(Color.RED);
        g.fillPolygon(xponits,ypointes,3);
        g.drawRect(60,80,40,20);
        g.setColor(Color.BLUE);
        g.fillRect(65,85,15,10);
        g.setColor(Color.PINK);
        g.fillRect(90,90,5,10);


    }





    public static void main(String args[]){
        Demo appwin = new Demo();

        appwin.setSize(new Dimension(500,500));
        appwin.setTitle("Graphics Demo");
        appwin.setVisible(true);

    }
}