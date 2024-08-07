
import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {

    public void paintComponent(Graphics g){

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
		int var2 = 0;
      int var3 = 50;
      String var4 = "111";
      int var5 = 0;
      g.drawLine(var2, 80, var2 + 300, 80);

      int var6;
      int var7;
      for(var6 = 0; var6 < var4.length(); ++var6) {
         var7 = var4.charAt(var6);
         if (var7 == 48) {
            g.drawLine(var2, 80, var3, 80);
         } else {
            if (var5 % 2 == 0) {
               g.drawLine(var2, 80, var2, 30);
               g.drawLine(var2, 30, var3, 30);
               g.drawLine(var3, 30, var3, 80);
            } else {
               g.drawLine(var2, 80, var2, 130);
               g.drawLine(var2, 130, var3, 130);
               g.drawLine(var3, 130, var3, 80);
            }

            ++var5;
         }

         var3 += 50;
         var2 += 50;
      }

        
        }

    }

    

