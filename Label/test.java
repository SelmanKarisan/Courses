package Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        JLabel label = new JLabel("Bro , do you even code?");
        frame.add(label);


    }
    
}
