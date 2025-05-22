package SwingOperations;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class Cmy_ColorTabbedPaneSwing {
	 JFrame f;

	 Cmy_ColorTabbedPaneSwing() {
	        f = new JFrame();

	        // Create panels with respective colors
	        JPanel cyanPanel = new JPanel();
	        JPanel magentaPanel = new JPanel();
	        JPanel yellowPanel = new JPanel();

	        cyanPanel.setBackground(Color.CYAN);
	        magentaPanel.setBackground(Color.MAGENTA);
	        yellowPanel.setBackground(Color.YELLOW);

	        // Create the tabbed pane and add tabs
	        JTabbedPane tp = new JTabbedPane();
	        tp.setBounds(50, 50, 200, 200);
	        tp.add("Cyan", cyanPanel);
	        tp.add("Magenta", magentaPanel);
	        tp.add("Yellow", yellowPanel);

	        // Add components to frame
	        f.add(tp);
	        f.setSize(400, 400);
	        f.setLayout(null);
	        f.setVisible(true);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {
	        new Cmy_ColorTabbedPaneSwing();
	    }
	}



