package computernetworks;
import javax.swing.*;
public class DrawLine {
	
	public static void main(String args[])
	{
		JFrame fr=new JFrame("Draw a line");
		fr.setSize(1500,1500);
		
		DrawLinePanel pane=new DrawLinePanel();
		DrawLinePanel1 panel1=new DrawLinePanel1();
		fr.add(pane);
		//fr.add(panel1);
		fr.setVisible(true);
		
	}
 
	

}
