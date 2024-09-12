/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author cmusick2025
 */
import java.awt.*;
import javax.swing.*;

// Create a constructor method
  public class Main extends JPanel{
    public Main(){
        super();
    }
    /* Create a paintComponent() method to override the one in
    JPanel.This is where the drawing happens. We don't have
    to call it in our program, it gets called automatically
    whenever the panel needs to be redrawn, like when it is
    made visible or moved or whatever.
    */
    public void paintComponent(Graphics g){
        g.drawLine(10,150,150,10); // Draw a line from (10,10) to (150,150)
        g.drawRect(50, 50, 40, 40);
        g.drawRect(60, 80, 225, 30);
        g.drawOval(75, 65, 20, 20);
        g.drawLine(35, 60, 100, 120);
        g.drawLine(50, 75, 120, 150);
        g.drawOval(110, 75, 200, 250);
        g.drawOval(400, 50, 500, 700);
        g.drawOval(1000, 50, 500, 700);
        g.fillOval(550, 165, 200, 400);
        g.fillOval(1150, 165, 200, 400);
        g.drawString("Out of all the clutter, find simplicity", 110, 70);
        g.drawString("-- Albert Einstein", 130, 100);
        g.drawRect(480, 820, 950, 150);
        g.drawLine(1600, 700, 1600, 1000);
        g.drawLine(1600, 850, 1700, 850);
        g.drawLine(1700, 700, 1700, 1000);
        g.drawLine(1800, 700, 1800, 1000);
        g.drawLine(1900, 700, 1900, 925);
        g.drawOval(1886, 978, 25, 25);
    }

    public static void main(String arg[]){
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
// Create a new identifier for a BasicJPanel called "panel",
// then create a new BasicJPanel object for it to refer to.
        Main panel = new Main();
// Make the panel object the content pane of the JFrame.
// This puts it into the drawable area of frame, and now
// we do all our drawing to panel, using paintComponent(), above.
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
