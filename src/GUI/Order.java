package GUI;
import java.awt.*;

import javax.swing.*;

import javax.swing.*;
public class Order extends JFrame {
	 private JLayeredPane container = new JLayeredPane();
	  private JPanel panel1 = new JPanel();
	  private JPanel panel2 = new JPanel();
	public Order() {
		
		//font declaration
		Font f=new Font("serif",Font.BOLD,60);
		Font fl=new Font("serif",Font.BOLD,30);
		Font ft=new Font("serif",Font.BOLD,20);
		JFrame frame= new JFrame("Booking page");
		panel1.setLayout(null);
		 panel1.setBounds(0, 0, 1650, 100);
		 panel1.setBackground(new Color(0 , 0 ,153,100));
		 frame.add(panel1);
		 
			//logo
			ImageIcon background_image1=new ImageIcon("logo.png");
			Image img1=background_image1.getImage();
			Image temp_img1=img1.getScaledInstance(100,90,Image.SCALE_SMOOTH);
			background_image1=new ImageIcon(temp_img1);
			JLabel background1=new JLabel("",background_image1,JLabel.CENTER);
			background1.setBounds(0,0,100,90);
		panel1.add(background1);
		JLabel request=new JLabel("Request a Quote for Private Chef");
		request.setBounds(120,0,500,90);
		request.setFont(fl);
		panel2.add(request);
		
		//label
		JLabel l1=new JLabel("Full Name:");
		l1.setBounds(70, 100, 100, 100);
		l1.setFont(ft);
		panel2.add(l1);
		
		JLabel l2=new JLabel("Mobile Number:");
		l2.setBounds(70, 150, 200, 100);
		l2.setFont(ft);
		panel2.add(l2);
		
		JLabel l3=new JLabel("Email:");
		l3.setBounds(70, 200, 200, 100);
		l3.setFont(ft);
		panel2.add(l3);
		
		JLabel l4=new JLabel("Email:");
		l4.setBounds(70, 200, 200, 100);
		l4.setFont(ft);
		panel2.add(l4);
		
		
		
		 
		 panel2.setLayout(null);
			panel2.setSize(700,350);
			panel2.setBackground(new Color(248,248,255,100));
			panel2.setBounds(370,175,650,550);
			frame.setLayout(null);
			frame.setBounds(0, 0, 1650, 1080);
			frame.getContentPane().setBackground(new Color(	255,102,102,40));
			 frame.setVisible(true);
			frame.add(panel2);
	
		
	}

	public static void main(String[] args) {
new Order();
	}

}
