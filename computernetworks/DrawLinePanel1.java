package computernetworks;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawLinePanel1  extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int c1=0;
		int c2=50;
		int c=0;
		String s="1101100111";
		int c3 = 25;
		int c4 = 25;
		
		//Bipolar RZ
		g.drawString("Bipolar RZ Encoding Technique",750,100);
		
		for(int i=50;i<=500;i+=50)
		{
			g.drawLine(i, 175, i, 35);
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String s1 = Character.toString(ch);
		    g.drawString(s1, c3, c4);
			
			if(ch=='0')
			{
				g.drawLine(c1, 100,c2 , 100);
			}
			else
			{
				if(c%2==0)
				{
					g.drawLine(c1, 100, c1, 50);
					g.drawLine(c1,50,c1+(c2-c1)/2,50);
					g.drawLine(c1+(c2-c1)/2,50, c1+(c2-c1)/2,100);
					g.drawLine(c1+(c2-c1)/2, 100, c2, 100);
				}
				else
				{
					g.drawLine(c1, 100, c1, 150);
					g.drawLine(c1, 150, c1+(c2-c1)/2, 150);
					g.drawLine(c1+(c2-c1)/2,150,c1+(c2-c1)/2,100);
					g.drawLine(c1+(c2-c1)/2, 100, c2, 100);
				}
				c++;
			}
			c1+=50;
			c2+=50;
			c3+=50;
			//c4+=25;
		/*g.drawLine(c1, 550, c1, 600);
				g.drawLine(c1,600,c1+(c2-c1)/2,600);
				g.drawLine(c1+(c2-c1)/2, 600, c1+(c2-c1)/2, 550);
				g.drawLine(c1+(c2-c1)/2, 550,c2 ,550);*/
			
			
			//Manchester encoding 
			
			
		}
		
		c1=0;
		c2=50;
		g.drawString("Manchester Encoding Thomas Technique",750,225);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String s1 = Character.toString(ch);
		    //g.drawString(s1, c3, c4);
			
			if(ch=='1')
			{
				//g.drawLine(c1, 250,c1+(c2-c1)/2 , 200);
				g.drawLine(c1, 200,c1+(c2-c1)/2 , 200);
				g.drawLine(c1+(c2-c1)/2, 200, c1+(c2-c1)/2, 250);
				g.drawLine(c1+(c2-c1)/2,250,c2,250);
				if(i!=s.length()-1&&s.charAt(i)=='1'&&s.charAt(i+1)=='1')
				{
					g.drawLine(c2, 250, c2, 200);
				}
				
			}
			else if(ch=='0')
			{
				g.drawLine(c1+(c2-c1)/2, 250, c1, 250);
				g.drawLine(c1+(c2-c1)/2, 250, c1+(c2-c1)/2, 200);
				g.drawLine(c1+(c2-c1)/2, 200, c2, 200);
				if(i!=s.length()-1&&s.charAt(i)=='0'&&s.charAt(i+1)=='0')
				{
					g.drawLine(c2, 200, c2, 250);
				}
				
			}
			
			c1+=50;
			c2+=50;
			c3+=50;
			//c4+=25;
		
			
		}
		
		c1=0;
		c2=50;
		
		g.drawString("Manchester Encoding IEEE 802.3 Technique",750,325);
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String s1 = Character.toString(ch);
		    //g.drawString(s1, c3, c4);
			
			if(ch=='0')
			{
				//g.drawLine(c1, 250,c1+(c2-c1)/2 , 200);
				g.drawLine(c1, 300,c1+(c2-c1)/2 , 300);
				g.drawLine(c1+(c2-c1)/2, 300, c1+(c2-c1)/2, 350);
				g.drawLine(c1+(c2-c1)/2,350,c2,350);
				if(i!=s.length()-1&&s.charAt(i)=='0'&&s.charAt(i+1)=='0')
				{
					g.drawLine(c2,350, c2, 300);
				}
				
			}
			else if(ch=='1')
			{
				g.drawLine(c1+(c2-c1)/2, 350, c1, 350);
				g.drawLine(c1+(c2-c1)/2, 350, c1+(c2-c1)/2, 300);
				g.drawLine(c1+(c2-c1)/2, 300, c2, 300);
				if(i!=s.length()-1&&s.charAt(i)=='1'&&s.charAt(i+1)=='1')
				{
					g.drawLine(c2, 300, c2, 350);
				}
				
			}
			
			c1+=50;
			c2+=50;
			
		
			
		}
		
	}
}