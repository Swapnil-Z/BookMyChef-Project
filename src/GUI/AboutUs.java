package GUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import JDBC.MainPage;
public class AboutUs extends JFrame {
	JFrame frame;
	 private JLayeredPane container = new JLayeredPane();
	 private JPanel panel=new JPanel();
	 private JPanel panel2 = new JPanel();
	 private JPanel panel3 = new JPanel();
	 private JPanel panel4 = new JPanel();
	 private JPanel panel5 = new JPanel();
	 private JPanel panel6 = new JPanel();
	
	public AboutUs() {
		frame = new JFrame("Payment Page");
		frame.setBounds(0, 0, 1650, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font fl=new Font("serif",Font.BOLD,25);
		Font f=new Font("serif",Font.BOLD,60);
		
		//logo
		ImageIcon background_image0=new ImageIcon("logo.png");
		Image img0=background_image0.getImage();
		Image temp_img0=img0.getScaledInstance(100,90,Image.SCALE_SMOOTH);
		background_image0=new ImageIcon(temp_img0);
		JLabel background0=new JLabel("",background_image0,JLabel.CENTER);
		background0.setBounds(10,10,100,90);
		panel.add(background0);		
		//side 1
				ImageIcon background_image=new ImageIcon("bookchef.png");
				Image img=background_image.getImage();
				Image temp_img=img.getScaledInstance(450,450,Image.SCALE_SMOOTH);
				background_image=new ImageIcon(temp_img);
				JLabel background=new JLabel("",background_image,JLabel.CENTER);
				
				ImageIcon background_image1=new ImageIcon("bookchef2.png");
				Image img1=background_image1.getImage();
				Image temp_img1=img1.getScaledInstance(450,450,Image.SCALE_SMOOTH);
				background_image1=new ImageIcon(temp_img1);
				JLabel background1=new JLabel("",background_image1,JLabel.CENTER);
				
				ImageIcon background_image2=new ImageIcon("bookchef3.png");
				Image img2=background_image2.getImage();
				Image temp_img2=img2.getScaledInstance(450,450,Image.SCALE_SMOOTH);
				background_image2=new ImageIcon(temp_img2);
				JLabel background2=new JLabel("",background_image2,JLabel.CENTER);
				

				ImageIcon background_imagel=new ImageIcon("order.png");
				Image imgl=background_imagel.getImage();
				Image temp_imgl=imgl.getScaledInstance(1600,250,Image.SCALE_SMOOTH);
				background_imagel=new ImageIcon(temp_imgl);
				JLabel backgroundl=new JLabel("",background_imagel,JLabel.CENTER);
				panel6.add(backgroundl);
				
			    panel4.add(background2);
		
				//quote
				JLabel q1=new JLabel("“Deliciousness at Your");
				q1.setFont(f);
				q1.setForeground(Color.black);
				q1.setBounds(700, 0, 800, 450);
				panel2.add(q1);
				
				JLabel q11=new JLabel("Doorstep”  ");
				q11.setFont(f);
				q11.setForeground(Color.black);
				q11.setBounds(880, 60, 700, 450);
				panel2.add(q11);
				
				JLabel q2=new JLabel(" “Mission”  ");
				q2.setFont(f);
				q2.setForeground(Color.black);
				q2.setBounds(300, 380, 700, 450);
				panel2.add(q2);
				
				JLabel q21=new JLabel(" “make wellness integrated hyper-personalized food accessible to everyone and also,");
				q21.setFont(fl);
				q21.setForeground(Color.black);
				q21.setBounds(85, 450, 840, 450);
				panel2.add(q21);
				
				JLabel q211=new JLabel(" To revolutionize the way you experience food and drink by providing");
				q211.setFont(fl);
				q211.setForeground(Color.black);
				q211.setBounds(150, 480, 800, 450);
				panel2.add(q211);
				
				JLabel q2111=new JLabel(" seamless access to the finest culinary talents and events.”  ");
				q2111.setFont(fl);
				q2111.setForeground(Color.black);
				q2111.setBounds(180, 510, 700, 450);
				panel2.add(q2111);
				
				
				JLabel q3=new JLabel(" “Vision”  ");
				q3.setFont(f);
				q3.setForeground(Color.black);
				q3.setBounds(950, 950, 700, 450);
				panel2.add(q3);
				
				
				JLabel q31=new JLabel(" “To make personalized food accessible to everyone by combining health tech,");
				q31.setFont(fl);
				q31.setForeground(Color.black);
				q31.setBounds(650, 1020, 840, 450);
				panel2.add(q31);
				
				JLabel q311=new JLabel(" food tech, and chef tech” ");
				q311.setFont(fl);
				q311.setForeground(Color.black);
				q311.setBounds(930, 1050, 840, 450);
				panel2.add(q311);
				
		
		JLabel home=new JLabel("Home");
		home.setBounds(1300, 0, 70, 50);
		home.setFont(fl);
		home.setForeground(Color.white);
		
		JLabel logout=new JLabel("Logout");
		logout.setBounds(1400, 0, 100, 50);
		logout.setFont(fl);
		logout.setForeground(Color.white);
		
		
		home.addMouseListener(new MouseAdapter()  
	    {  
	        public void mouseClicked(MouseEvent e)  
	        { 
	          MainPage p=new MainPage();
	           p.setVisible(true);

	        }  
	    });
		
		logout.addMouseListener(new MouseAdapter()  
	    {  
	        public void mouseClicked(MouseEvent e)  
	        { 
	          LoginPage p=new LoginPage();
	           p.setVisible(true);

	        }  
	    });
		
		
		
		container = new JLayeredPane();
		JScrollPane jsp = new JScrollPane(container);
	    container.setPreferredSize(new Dimension(0, 2000));
	    container.setLayout(null);
	    
	    panel.setLayout(null);
        panel.setBackground(new Color(0 , 0 ,153,100));
        panel.setBounds(0, 0, 1600, 100);
        container.add(panel, new Integer(0), 0);
        
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,102,102,40));
        panel2.setBounds(0, 100, 1600, 2000);
        container.add(panel2, new Integer(1), 0);
        
       // panel3.setLayout(null);
        panel3.setBackground(new Color(255,102,102,40));
        panel3.setBounds(50, 150, 450, 450);
        container.add(panel3, new Integer(1), 0);
        
        panel4.setBackground(new Color(255,102,102,40));
        panel4.setBounds(900, 650, 450, 450);
        container.add(panel4, new Integer(1), 0);
        
        panel5.setBackground(new Color(255,102,102,40));
        panel5.setBounds(50, 1150, 450, 450);
        container.add(panel5, new Integer(1), 0);
        
        panel6.setBackground(Color.white);
        panel6.setBounds(0, 1745, 1600, 250);
        container.add(panel6, new Integer(1), 0);
        
        panel.add(home);
        panel.add(logout);
        panel3.add(background);
        panel4.add(background1);
        panel5.add(background2);
        

	    //container.add(background);
	    frame.getContentPane().add(jsp);
        frame.setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
new AboutUs();
	}

}
