package JDBC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;

import com.mysql.cj.xdevapi.AddResult;

import GUI.AboutUs;
import GUI.LoginPage;
import GUI.MyAccount;
import GUI.Order;
import GUI.Order1;
import GUI.signup;

public class MainPage extends JFrame {
	 private JLayeredPane container = new JLayeredPane();
	 private JPanel panel = new JPanel();
	  private JPanel panelBlue = new JPanel();
	  private JPanel panelGreen = new JPanel();
	  private JPanel panel3 = new JPanel();
	  private JPanel panel4 = new JPanel();
	  private JPanel panel5 = new JPanel();
	  private JPanel panel6 = new JPanel();
	  private JPanel panel7 = new JPanel();
	  private JButton btn1=new JButton("Book now");
	public MainPage() {
		Font fl=new Font("serif",Font.BOLD,20);
		JFrame frame= new JFrame("hi");
		frame.setBounds(0, 0, 1650, 1080);
		
		//side 1
		ImageIcon background_image=new ImageIcon("side1.png");
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(1600,500,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1500,1080);
		add(background);
		
		
		
		//button
		btn1.setBounds(329, 425, 132, 29);
		btn1.setBorder(new EtchedBorder(10));
		//btn1.setBackground(getForeground());
		background.add(btn1);
		
		//side2
		ImageIcon background_image1=new ImageIcon("side5.png");
		Image img1=background_image1.getImage();
		Image temp_img1=img1.getScaledInstance(1600,500,Image.SCALE_SMOOTH);
		background_image1=new ImageIcon(temp_img1);
		JLabel background1=new JLabel("",background_image1,JLabel.CENTER);
		background1.setBounds(0,0,1650,1080);
		add(background1);
		
		//side3
		ImageIcon background_image2=new ImageIcon("side3.png");
		Image img2=background_image2.getImage();
		Image temp_img2=img2.getScaledInstance(1600,250,Image.SCALE_SMOOTH);
		background_image2=new ImageIcon(temp_img2);
		JLabel background2=new JLabel("",background_image2,JLabel.CENTER);
		background2.setBounds(0,0,1650,1080);
		add(background2);
		
		ImageIcon background_image3=new ImageIcon("side4.png");
		Image img3=background_image3.getImage();
		Image temp_img3=img3.getScaledInstance(1600,500,Image.SCALE_SMOOTH);
		background_image3=new ImageIcon(temp_img3);
		JLabel background3=new JLabel("",background_image3,JLabel.CENTER);
		background3.setBounds(0,0,1650,1080);
		add(background3);
		
		ImageIcon background_image4=new ImageIcon("side2.png");
		Image img4=background_image4.getImage();
		Image temp_img4=img4.getScaledInstance(1600,500,Image.SCALE_SMOOTH);
		background_image4=new ImageIcon(temp_img4);
		JLabel background4=new JLabel("",background_image4,JLabel.CENTER);
		background4.setBounds(0,0,1650,1080);
		add(background4);
		
		ImageIcon background_image6=new ImageIcon("side6.png");
		Image img6=background_image6.getImage();
		Image temp_img6=img6.getScaledInstance(1600,500,Image.SCALE_SMOOTH);
		background_image6=new ImageIcon(temp_img6);
		JLabel background6=new JLabel("",background_image6,JLabel.CENTER);
		background6.setBounds(0,0,1650,1080);
		add(background6);
		
		ImageIcon background_image7=new ImageIcon("side7.png");
		Image img7=background_image7.getImage();
		Image temp_img7=img7.getScaledInstance(1600,300,Image.SCALE_SMOOTH);
		background_image7=new ImageIcon(temp_img7);
		JLabel background7=new JLabel("",background_image7,JLabel.CENTER);
		background7.setBounds(0,0,1650,1080);
		add(background7);
	
		//logo
		ImageIcon background_image5=new ImageIcon("logo.png");
		Image img5=background_image5.getImage();
		Image temp_img5=img5.getScaledInstance(100,90,Image.SCALE_SMOOTH);
		background_image5=new ImageIcon(temp_img5);
		JLabel background5=new JLabel("",background_image5,JLabel.CENTER);
		background5.setBounds(10,10,100,90);
		add(background5);
		//JPanel container = new JPanel();
        JScrollPane jsp = new JScrollPane(container);
        container.setPreferredSize(new Dimension(0, 3200));
        container.setLayout(null);
        
        panel.setLayout(null);
        panel.setBackground(new Color(255,102,0,100));
        panel.setBounds(0, 0, 1600, 100);
        container.add(panel, new Integer(5), 0);
        
        panelBlue.setBackground(Color.LIGHT_GRAY);
        panelBlue.setBounds(0, 100, 1600, 500);
        container.add(panelBlue, new Integer(0), 0);
        
        panelGreen.setBackground(Color.LIGHT_GRAY);
        panelGreen.setBounds(0, 600, 1600, 500);
        container.add(panelGreen, new Integer(1), 0);
        
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.setBounds(0, 1100, 1600, 250);
        container.add(panel3, new Integer(2), 0);
        
        panel4.setBackground(Color.LIGHT_GRAY);
        panel4.setBounds(0, 1350, 1600, 500);
        container.add(panel4, new Integer(3), 0);
        
        panel5.setBackground(Color.LIGHT_GRAY);
        panel5.setBounds(0, 1850, 1600, 500);
        container.add(panel5, new Integer(4), 0);
        
        panel6.setBackground(Color.LIGHT_GRAY);
        panel6.setBounds(0, 2350, 1600, 500);
        container.add(panel6, new Integer(6), 0);
        
        panel7.setBackground(Color.LIGHT_GRAY);
        panel7.setBounds(0, 2850, 1600, 300);
        container.add(panel7, new Integer(6), 0);
        
        //label
        JLabel logout=new JLabel("Logout");
        logout.setBounds(1430, 0, 70, 50);
        logout.setFont(fl);
        
        JLabel home=new JLabel("Home");
        home.setBounds(1050, 0, 70, 50);
        home.setFont(fl);
        panel.add(home);
        
        JLabel Myacc=new JLabel("My Account");
        Myacc.setBounds(1150, 0, 150, 50);
        Myacc.setFont(fl);
        panel.add(Myacc);
        
        JLabel aboutus=new JLabel("About Us");
        aboutus.setBounds(1300, 0, 100, 50);
        aboutus.setFont(fl);
        panel.add(aboutus);
        
        
        panelBlue.add(background);
        panelGreen.add(background1);
        panel.add(background5);
        panel3.add(background2);
        panel4.add(background3);
        panel5.add(background4);
        panel6.add(background6);
        panel7.add(background7);
        panel.add(logout);
        
        btn1.addActionListener(new ActionListener()  
        {  
        	public void actionPerformed(ActionEvent ae) 
            { 
              Order1 p=new Order1();
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
        
        aboutus.addMouseListener(new MouseAdapter()  
        {  
            public void mouseClicked(MouseEvent e)  
            { 
              AboutUs p=new AboutUs();
               p.setVisible(true);

            }  
        }); 
        
        Myacc.addMouseListener(new MouseAdapter()  
        {  
            public void mouseClicked(MouseEvent e)  
            { 
             MyAccount p=new MyAccount();
               p.setVisible(true);

            }  
        });
        
        //panelGreen.add(background);
	
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//    	frame.setUndecorated(true);
		  frame.getContentPane().add(jsp);
	        frame.setVisible(true);
		
	}





	public static void main(String[] args) {
new MainPage();

	}

}
