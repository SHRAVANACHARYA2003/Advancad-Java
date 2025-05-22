package SwingOperations;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ImageButtonSwing {
	JLabel messageLabel;

	ImageButtonSwing() {
        
        JFrame frame = new JFrame("Clock & Hourglass Button Example");

        
        messageLabel = new JLabel();
        messageLabel.setBounds(50, 30, 500, 50);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));

        
        ImageIcon digitalClockIcon = new ImageIcon("F:\\digital.png"); 
        ImageIcon hourGlassIcon = new ImageIcon("F:\\hour.png");        

        
        JButton digitalClockButton = new JButton(digitalClockIcon);
        digitalClockButton.setBounds(100, 100, 120, 120);
        digitalClockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        
        JButton hourGlassButton = new JButton(hourGlassIcon);
        hourGlassButton.setBounds(300, 100, 120, 120);
        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

         
        frame.add(messageLabel);
        frame.add(digitalClockButton);
        frame.add(hourGlassButton);

        
        frame.setSize(550, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


	public static void main(String[] args) {
		new ImageButtonSwing();

	}

}
