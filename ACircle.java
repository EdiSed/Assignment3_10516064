/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edinamsedo
 */
import java.awt.*;
import javax.swing.JFrame;

public class ACircle extends Canvas
{
    public void paint (Graphics edi)
    {
        edi.setColor(Color.green);
        edi.fillOval(160, 90, 200, 200);  //a filled in circle
    }
    public static void main(String[] args) 
    {
         JFrame win = new JFrame("Edi's Circle");
        win.setSize(600,400);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ACircle canvas = new ACircle();
        win.add( canvas );
        win.setVisible(true);
        
    }
    
}
