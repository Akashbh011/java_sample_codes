
import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {

    public void paintComponent(Graphics g){
		g.setColor(Color.blue);
				// g.setFont(new Font("Arial", Font.BOLD, 12));

        // String ss="01100";
        //Bipolar NRZ-->
        int c1 = 0;
		int c2 = 50;
		String s = "111";
		int counter = 0;
        g.drawLine(c1,80,c1+300,80);
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='0') {
				g.drawLine(c1,80 ,c2 ,80 );
			}else {
				if(counter%2==0) {
					g.drawLine(c1,80 ,c1 ,30 );
					g.drawLine(c1,30 ,c2 ,30 );
					g.drawLine(c2,30 ,c2 ,80 );
				}else {
					g.drawLine(c1,80 ,c1 ,130 );
					g.drawLine(c1,130 ,c2 ,130 );
					g.drawLine(c2,130 ,c2 ,80 );
				}
				counter++;
			}
			c2+=50;
			c1+=50;

		}
				g.setFont(new Font("Arial", Font.BOLD, 12));

		g.setColor(Color.red);
		g.drawString("BIPOLAR NRZ", 50, 160);

        		g.setColor(Color.blue);

        //Bipolar RZ-->

        int a1 = 0;
		int a2 = 50;
		String s1 = "111";
		int counter1 = 0;
        g.drawLine(a1,250,a1+300,250);
       // g.drawLine(a1+50,200,a1+50,300);

		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch=='0') {
				g.drawLine(a1,250 ,a2 ,250 );
			}else {
				if(counter1%2==0) {
					g.drawLine(a1,250 ,a1 ,200 );
					g.drawLine(a1,200 ,a2-25 ,200 );
					g.drawLine(a2-25,200 ,a2-25 ,250 );
                    g.drawLine(a2-25,250 ,a2 ,250 );

				}else {
					g.drawLine(a1,250 ,a1 ,300 );
					g.drawLine(a1,300 ,a2-25 ,300 );
					g.drawLine(a2-25,300,a2-25 ,250 );
                    g.drawLine(a2-25,250,a2 ,250 );
				}
				counter1++;
			}
			a2+=50;
			a1+=50;
		}

		g.setColor(Color.red);
		g.drawString("BIPOLAR RZ", 50, 330);

		
        		g.setColor(Color.blue);

		//manchester encoding -->

        int z1 = 0;
		int z2 = 50;
		String s2 = "1111";
		int counter2 = 0;
        g.drawLine(z1,420,z1+300,420);
       // g.drawLine(a1+50,200,a1+50,300);

		for(int i=0;i<s2.length();i++) {
			char ch = s2.charAt(i);
			if(ch=='0') {
				g.drawLine(z1,420 ,z2-25 ,420 );
				g.drawLine(z1+25,420 ,z1+25 ,370 );
				g.drawLine(z1+25,370 ,z2 ,370 );
				g.drawLine(z2,370 ,z2 ,420 );

			}else {
					g.drawLine(z1,420 ,z1 ,370 );
					g.drawLine(z1,370 ,z1+25 ,370 );
					g.drawLine(z1+25,370 ,z2-25 ,420 );
					g.drawLine(z1+25,420 ,z2 ,420 );
					
                    //g.drawLine(z2,370,z2 ,420 );
				}
				z1+=50;
			z2+=50;
			}


			g.setColor(Color.red);
		g.drawString("MANCHESTER--THOMAS", 50, 450);

        		g.setColor(Color.blue);

			int k1 = 0;
		int k2 = 50;
		String s3 = "1111";
		//int counter2 = 0;
        g.drawLine(k1,580,k1+300,580);
       // g.drawLine(a1+50,200,a1+50,300);

		for(int i=0;i<s3.length();i++) {
			char ch = s3.charAt(i);
			if(ch=='0') {
				
				g.drawLine(k1,580 ,k1 ,530 );
					g.drawLine(k1,530 ,k1+25 ,530 );
					g.drawLine(k1+25,530 ,k2-25 ,580 );
					g.drawLine(k1+25,580 ,k2 ,580 );

			}else {
					g.drawLine(k1,580 ,k2-25 ,580 );
				g.drawLine(k1+25,580 ,k1+25 ,530 );
				g.drawLine(k1+25,530 ,k2 ,530 );
				g.drawLine(k2,530 ,k2 ,580 );

					
                    //g.drawLine(z2,370,z2 ,420 );
				}
				k1+=50;
			k2+=50;
			}
			g.setColor(Color.red);
		g.drawString("MANCHESTER--802.3", 50, 610);

        		g.setColor(Color.blue);





				int x1 = 400;
				int x2 = 450;
				int y = 80;
				String d3 = "1110";
				int last=0;
				g.drawLine(x1, y, x1 + 300, y);
				
				for (int i = 0; i < d3.length(); i++) {
					char ch = d3.charAt(i);

					if(i==0){


						if(ch=='0'){
							g.drawLine(x1, y+50, x1, y - 50);
						g.drawLine(x1, y - 50, x1 + 25, y - 50);
						g.drawLine(x1 + 25, y - 50, x2 - 25, y+50);
						g.drawLine(x1 + 25, y+50, x2, y+50);
						last=-1;



						}
						else{
							g.drawLine(x1, y-50, x2 - 25, y-50);
						g.drawLine(x1 + 25, y-50, x1 + 25, y + 50);
						g.drawLine(x1 + 25, y + 50, x2, y +50);
						//g.drawLine(x2, y - 50, x2, y);
						last=-1;



						}
					}else{



					if (ch == '0') {

						if(last==1){
						g.drawLine(x1, y-50, x1, y + 50);
						g.drawLine(x1, y + 50, x1 + 25, y + 50);
						g.drawLine(x1 + 25, y + 50, x2 - 25, y-50);
						g.drawLine(x1 + 25, y-50, x2, y-50);
						last=1;


					}else{
						g.drawLine(x1, y+50, x1, y - 50);
						g.drawLine(x1, y - 50, x1 + 25, y - 50);
						g.drawLine(x1 + 25, y - 50, x2 - 25, y+50);
						g.drawLine(x1 + 25, y+50, x2, y+50);
						last=-1;

					}


					} else {

						if(last==1){
						

						g.drawLine(x1, y-50, x2 - 25, y-50);
						g.drawLine(x1 + 25, y-50, x1 + 25, y + 50);
						g.drawLine(x1 + 25, y + 50, x2, y +50);

						last=-1;
						}else{

							g.drawLine(x1, y+50, x2 - 25, y+50);
						g.drawLine(x1 + 25, y+50, x1 + 25, y - 50);
						g.drawLine(x1 + 25, y - 50, x2, y -50);

						last=1;

						}
					}
					

					}
					x1 += 50;
					x2 += 50;
				}
				
				g.setColor(Color.red);
				g.drawString("Differential-Manchester Encoding: " , 450, 160);
				g.setColor(Color.blue);

				//UNIPOLAR NRZ--

				int p1 = 400;
int p2 = 450;
String q = "10101";

g.drawLine(p1, 250, p1 + 300, 250);

for (int i = 0; i < q.length(); i++) {
    char ch = q.charAt(i);
    if (ch == '0') {
        g.drawLine(p1, 250, p2, 250);
    } else {
        
            g.drawLine(p1, 250, p1, 200);
            g.drawLine(p1, 200, p2, 200);
            g.drawLine(p2, 200, p2, 250);
        
    }
    p2 += 50;
    p1 += 50;
}

g.setFont(new Font("Arial", Font.BOLD, 12));

g.setColor(Color.red);
g.drawString("UNIPOLAR-NRZ", 450, 330);

g.setColor(Color.blue);

//unipolar rz

int l = 400;
int m = 450;
String q2 = "10101";

g.drawLine(l, 420, l + 300, 420);

for (int i = 0; i < q2.length(); i++) {
    char ch = q2.charAt(i);
    if (ch == '0') {
        g.drawLine(l, 420, m, 420);
    } else {
        
        g.drawLine(l, 420, l, 370);
        g.drawLine(l, 370, m-25, 370);
        g.drawLine(m-25, 370, m-25, 420);
		g.drawLine(m-25,420,m,420);
        
    }
    m += 50;
    l += 50;
}

g.setFont(new Font("Arial", Font.BOLD, 12));

g.setColor(Color.red);
g.drawString("UNIPOLAR-RZ", 450, 450);

g.setColor(Color.blue);


//polar RZ
int g1 = 400;
int g2 = 450;
String q3 = "10101";

g.drawLine(g1, 580, g1 + 300, 580);

for (int i = 0; i < q3.length(); i++) {
    char ch = q3.charAt(i);
    if (ch == '0') {
        g.drawLine(g1, 580, g1, 630);
		g.drawLine(g1, 630, g2-25, 630);
		g.drawLine(g1+25, 630, g2-25, 580);
		g.drawLine(g1+25, 580, g2, 580);

    } else {
        
        g.drawLine(g1, 580, g1, 530);
        g.drawLine(g1, 530, g2 - 25, 530);
        g.drawLine(g2 - 25, 530, g2 - 25, 580);
        g.drawLine(g2 - 25, 580, g2, 580);
        
    }
    g2 += 50;
    g1 += 50;
}

g.setFont(new Font("Arial", Font.BOLD, 12));

g.setColor(Color.red);
g.drawString("POLAR-RZ", 450, 660);

g.setColor(Color.blue);







				


		}











        
        }
	
    

    

