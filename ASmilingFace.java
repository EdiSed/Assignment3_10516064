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

public class ASmilingFace extends Canvas
{
    public void paint(Graphics edi)
    {
        edi.setColor(Color.YELLOW);
        edi.fillOval(160,90,250,250);
        
        edi.setColor(Color.blue);
        edi.fillOval(200, 160, 20, 20);
        edi.fillOval(350, 160, 20, 20);
        
        
        
    }
    public static void main(String[]args)
    {
        JFrame win = new JFrame("Edi's Smiling Face");
        win.setSize(600,400);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ASmilingFace canvas = new ASmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
}
