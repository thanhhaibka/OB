/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_pmac;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author greeny
 */
public class Draw extends JFrame {

    private final Individual individual;

    public Draw(Individual individual) {
        this.individual = individual;
        setTitle("Drawing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 100, 100);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setSize(new Dimension(700, 700));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBackground(Color.GREEN);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        
        g2d.setRenderingHints(rh);
        for(int i = 0; i < this.individual.getObstacles().size(); i++){
            g2d.setColor(new Color(191,191,191));
            double xmin = this.individual.getObstacles().get(i).getXmin()*5;
            double xmax = this.individual.getObstacles().get(i).getXmax()*5;
            double ymin = this.individual.getObstacles().get(i).getYmin()*5;
            double ymax = this.individual.getObstacles().get(i).getYmax()*5;
            g2d.fill(new Rectangle2D.Double(100 + xmin,100 + ymin, xmax - xmin, ymax - ymin));
            g2d.setColor(Color.BLACK);
            g2d.draw(new Rectangle2D.Double(100 + xmin,100 + ymin, xmax - xmin, ymax - ymin));
        }
        double a, b, c;
        for (int i = Individual.NUMGENS - 1; i >= 0 ; i--) {
            a = this.individual.getGenes().get(i).getX() * 5;
            b = this.individual.getGenes().get(i).getY() * 5;
            c = this.individual.getGenes().get(i).getR() * 5;
            if (c == 6 * 5) {
                g2d.setColor(new Color(146, 208, 80));
            } else if (c == 4.8 * 5) {
                g2d.setColor(new Color(142, 170, 219));
            } else {
                g2d.setColor(new Color(244, 176, 131));
            }
            g2d.fill(new Ellipse2D.Double(a - c + 100, b - c + 100, 2 * c, 2 * c));
            g2d.setColor(Color.BLACK);
            g2d.draw(new Ellipse2D.Double(a - c + 100, b - c + 100, 2 * c, 2 * c));
        }
        
        g2d.drawLine(100, 100, 600, 100);
        g2d.drawLine(100, 100, 100, 600);
        g2d.drawLine(600, 100, 600, 600);
        g2d.drawLine(100, 600, 600, 600);
    }
}
