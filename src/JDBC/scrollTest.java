package JDBC;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.*;
public class scrollTest extends JFrame {
	 private JFrame frame;
	 private JLayeredPane container = new JLayeredPane();
	   private JPanel panelBlue = new JPanel();
	    private JPanel panelGreen = new JPanel();
	public static void main(String[] args) {
		scrollTest window=new scrollTest();
    	

	}
	public scrollTest() {
		frame = new JFrame("hello");
		//frame.setSize(1650,1080);
	    frame.setBounds(0, 0, 1650, 1080);
	    
//		ImageIcon background_image=new ImageIcon("login_image.jpg");
//		Image img=background_image.getImage();
//		Image temp_img=img.getScaledInstance(1650,500,Image.SCALE_SMOOTH);
//		background_image=new ImageIcon(temp_img);
//		JLabel background=new JLabel("",background_image,JLabel.CENTER);
//		background.setBounds(0,0,1650,1080);
//		add(background);
	
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 container = new JLayeredPane();
		 JScrollPane jsp = new JScrollPane(container);
	        container.setPreferredSize(new Dimension(0, 1080));
	        container.setLayout(null);
	        
	        panelBlue.setBackground(Color.BLUE);
	        panelBlue.setBounds(0, 0, 1650, 500);
	       // panelBlue.add(background);
	        panelGreen.setBackground(Color.GREEN);
	        panelGreen.setBounds(0, 500, 500, 100);
	        
	        container.add(panelBlue, new Integer(0), 0);
	        container.add(panelGreen, new Integer(1), 0);
	       // frame.pack();

//	        JLabel lblHelloWorld = new JLabel("Hello World");
//	        lblHelloWorld.setBounds(10, 11, 101, 14);
//	        container.add(lblHelloWorld);
	        frame.getContentPane().add(jsp);
	        frame.setVisible(true);
		
	}
	

}

