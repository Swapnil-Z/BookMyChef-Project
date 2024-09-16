package Practice_project;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
public class scrollTest {
	 private JFrame frame;
	 private JLayeredPane container = new JLayeredPane();
	   private JPanel panelBlue = new JPanel();
	    private JPanel panelGreen = new JPanel();
	public static void main(String[] args) {
		Test window=new Test();
    	

	}
	public scrollTest() {
		frame = new JFrame("hello");
        frame.setBounds(0, 0, 1650, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 container = new JLayeredPane();
		 JScrollPane jsp = new JScrollPane(container);
	        container.setPreferredSize(new Dimension(0, 1080));
	        container.setLayout(null);
	        
	        panelBlue.setBackground(Color.BLUE);
	        panelBlue.setBounds(0, 0, 500, 40);
	        
	        panelGreen.setBackground(Color.GREEN);
	        panelGreen.setBounds(0, 0, 500, 100);
	        
//	        container.add(panelBlue, new Integer(0), 0);
//	        container.add(panelGreen, new Integer(1), 0);
//	        frame.pack();

	        JLabel lblHelloWorld = new JLabel("Hello World");
	        lblHelloWorld.setBounds(10, 11, 101, 14);
	        container.add(lblHelloWorld);
	        frame.getContentPane().add(jsp);
    	frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	    	frame.setUndecorated(true);
	        frame.setVisible(true);
		
	}

}
