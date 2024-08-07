 import javax.swing.*;
import java.awt.*;

public class assignmentlabbasic {
    public static void main(String[] args) {
        
        JFrame frame =  new JFrame("lines");
        frame.setSize(1400,1400);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new Panel());
        frame.setVisible(true);

    }
    
}
