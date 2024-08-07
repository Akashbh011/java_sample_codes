package ComputerNetworks;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JPanel;

public class DrawLinePanel3 extends JPanel{
	    //Unipolar NRZ
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			drawDottedLine(g);
			int c1 = 0;
			int c2 = 50;
			Graphics2D g2d = (Graphics2D) g;
			 g2d.setColor(Color.DARK_GRAY);
		     g2d.setStroke(new BasicStroke(2)); 
			Scanner sc = new Scanner(System.in);
			//String p = sc.nextLine();
			String p = "1011";
			if(p.charAt(0)=='0') {
				g2d.drawLine(c1,80 ,c2 ,80 );
			}else {
				g2d.drawLine(c1,80 ,c1 ,50 );
				g2d.drawLine(c1,50 ,c2 ,50 );
				g2d.drawLine(c2,50 ,c2 ,80 );	
			}
			c2+=50;
			c1+=50;
			for(int i=1;i<p.length()-1;i++) {
				char ch = p.charAt(i);
				if(ch=='0') {
					g2d.drawLine(c1,80 ,c2 ,80 );
				}else {
					if(p.charAt(i-1)!='1' && p.charAt(i+1)!='1') {
						g2d.drawLine(c1,80 ,c1 ,50 );
						g2d.drawLine(c1,50 ,c2 ,50 );
						g2d.drawLine(c2,50 ,c2 ,80 );		
					}else if(p.charAt(i-1)=='1' && p.charAt(i+1)!='1') {
						g2d.drawLine(c1,50 ,c2 ,50 );
						g2d.drawLine(c2,50 ,c2 ,80 );	
					}else {
						g2d.drawLine(c1,80 ,c1 ,50 );
						g2d.drawLine(c1,50 ,c2 ,50 );
					}
					
				}
				c2+=50;
				c1+=50;
			}
			if(p.charAt(p.length()-1)=='0') {
				g2d.drawLine(c1,80 ,c2 ,80 );
			}else {
				if(p.charAt(p.length()-2)!='1') {
					g2d.drawLine(c1,80 ,c1 ,50 );
					g2d.drawLine(c1,50 ,c2 ,50 );
					g2d.drawLine(c2,50 ,c2 ,80 );	
				}else {
					g2d.drawLine(c1,50 ,c2 ,50 );
					g2d.drawLine(c2,50 ,c2 ,80 );	
				}
	
			}
			
		}
		private void drawDottedLine(Graphics g) {
			// TODO Auto-generated method stub
			 Graphics2D g2d = (Graphics2D) g.create();
		        
		        // Set the line style to dotted
		    float[] dashPattern = {5, 5}; // 5 pixels on, 5 pixels off
		    g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, dashPattern, 0));

		        // Draw the line from (x1, y1) to (x2, y2)
		    int x1 = 0;
		    int y1 = 80;
		    int x2 = 2000;
		    int y2 = 80;
		    g2d.drawLine(x1, y1, x2, y2);
		    
		    for(int i=50;i<=1000;i+=50) {
				g.drawLine(i,150,i ,50 );
			}

		    g2d.dispose();
		}
}
