package janpan.sawit.lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/*
 * This Program OlympicSymbol will draw olympicSymbol for another class.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/2/2023
 */

public class OlympicSymbol extends JPanel {
    protected Ellipse2D.Double circle1;
    protected Ellipse2D.Double circle2;
    protected Ellipse2D.Double circle3;
    protected Ellipse2D.Double circle4;
    protected Ellipse2D.Double circle5;
    protected Color color_background;
    // declare instance variable

    @Override//Overwrite Method
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        circle1 = new Ellipse2D.Double(10, 10, 50, 50);
        circle2 = new Ellipse2D.Double.Double(60, 10, 50, 50);
        circle3 = new Ellipse2D.Double.Double(110, 10, 50, 50);// set position and size of circle
        circle4 = new Ellipse2D.Double.Double(35, 35, 50, 50);
        circle5 = new Ellipse2D.Double(85, 35, 50, 50);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));//set Stroke
        g2d.setColor(Color.blue);
        g2d.draw(circle1);
        g2d.setColor(Color.red);
        g2d.draw(circle2);// draw circle
        g2d.setColor(Color.yellow);// set color for circle
        g2d.draw(circle3);
        g2d.setColor(Color.green);
        g2d.draw(circle4);
        g2d.setColor(Color.BLACK);
        g2d.draw(circle5);

        color_background = new Color(255, 255, 255);// change background to white
        this.setBackground(color_background);
    }

}
