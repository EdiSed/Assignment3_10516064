/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author edinamsedo
 */
public class GraphicsDemo1 extends Canvas
{

   public void paint (Graphics g)
   {
       g.setColor(Color.green);
       g.drawRect(50,20,100,200);   //draw a retangle
       g.fillOval(160,20,100,200);  //draw a filled-in oval
       g.setColor(Color.blue);
       g.fillRect(200,400,200,20);  //a filled-in rectangle
       g.drawOval(200,430,200,100);
       g.setColor(Color.red);
       g.fillRect(170,300,150,150);   //a filled-in square
       
       g.setColor(Color.black);
       g.drawString("Graphics are pretty neat.", 500,100);
       int x = getWidth() / 2;
       int y = getHeight() / 2;
       g.drawString("The first letter of this srting is at("+ x + "," + y + ")", x, y);

    }
   public static void main(String[] args)
   {
           
       // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
        
        //1. 800*600, 800wide, 600 tall.
        //2. The first two values are the starting points of the drawing,
        //the third value is the size of the lenght and the last value is the size of the breadth.
        //3.The first two values are the x,y values of the upper left corner of the oval to be filled,
        //the third and fourth values are the width and height of the oval to be filled.
        //4. They are the x and y values representing the position of the string.
        //5.The last drawing overshadows the first drawings.
    }
}
