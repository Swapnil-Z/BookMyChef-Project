package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import JDBC.MainPage;

import java.sql.*;
public class Order1 extends JFrame {
	final Connection con=null;
	 Statement stmt=null;
	final ResultSet rs=null;
	final String q =null;
	protected PreparedStatement pst;
	
 private JLayeredPane container = new JLayeredPane();
 private JPanel panel1 = new JPanel();
 private JPanel panel2 = new JPanel();
 private JPanel panel3 = new JPanel();
 private JPanel panel4 = new JPanel();
	public Order1() {
		Font ft=new Font("serif",Font.BOLD,20);
		Font s=new Font("serif",Font.BOLD,20);
		Font f=new Font("serif",Font.BOLD,35);
		Font fl=new Font("Monospaced",Font.BOLD,20);
		
		JFrame frame = new JFrame("hello");
        frame.setBounds(0, 0, 1650, 1080);
        //frame.setLayout(null);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1.setLayout(null);
        
      //logo
		ImageIcon background_image1=new ImageIcon("logo.png");
		Image img1=background_image1.getImage();
		Image temp_img1=img1.getScaledInstance(100,90,Image.SCALE_SMOOTH);
		background_image1=new ImageIcon(temp_img1);
		JLabel background1=new JLabel("",background_image1,JLabel.CENTER);
		background1.setBounds(0,0,100,90);
	    panel1.add(background1);
	    
		ImageIcon background_image2=new ImageIcon("order.png");
		Image img2=background_image2.getImage();
		Image temp_img2=img2.getScaledInstance(1600,400,Image.SCALE_SMOOTH);
		background_image2=new ImageIcon(temp_img2);
		JLabel background2=new JLabel("",background_image2,JLabel.CENTER);
		background2.setBounds(0,0,1600,400);
	    panel4.add(background2);
	    
		ImageIcon background_image3=new ImageIcon("book3.jpg");
		Image img3=background_image3.getImage();
		Image temp_img3=img3.getScaledInstance(390,350,Image.SCALE_SMOOTH);
		background_image3=new ImageIcon(temp_img3);
		JLabel background3=new JLabel("",background_image3,JLabel.CENTER);
		background3.setBounds(-620,-200,1650,1500);
	    panel2.add(background3);
	    
	    ImageIcon background_image4=new ImageIcon("book1.jpg");
		Image img4=background_image4.getImage();
		Image temp_img4=img4.getScaledInstance(390,350,Image.SCALE_SMOOTH);
		background_image4=new ImageIcon(temp_img4);
		JLabel background4=new JLabel("",background_image4,JLabel.CENTER);
		background4.setBounds(480,-500,1650,1500);
	    panel2.add(background4);
	    
	    ImageIcon background_image5=new ImageIcon("book2.jpg");
		Image img5=background_image5.getImage();
		Image temp_img5=img5.getScaledInstance(390,350,Image.SCALE_SMOOTH);
		background_image5=new ImageIcon(temp_img5);
		JLabel background5=new JLabel("",background_image5,JLabel.CENTER);
		background5.setBounds(480,120,1650,1500);
	    panel2.add(background5);
	    
	    ImageIcon background_image6=new ImageIcon("book4.jpg");
		Image img6=background_image6.getImage();
		Image temp_img6=img6.getScaledInstance(390,350,Image.SCALE_SMOOTH);
		background_image6=new ImageIcon(temp_img6);
		JLabel background6=new JLabel("",background_image6,JLabel.CENTER);
		background6.setBounds(-620,440,1650,1500);
	    panel2.add(background6);
        
	    JLabel request=new JLabel("Request a Quote for Private Chef");
		request.setBounds(80,0,500,90);
		request.setForeground(Color.black);
		request.setFont(f);
		panel3.add(request);
		
		JLabel home=new JLabel("Home");
		home.setBounds(1200, 0, 70, 50);
		home.setFont(fl);
		home.setForeground(Color.white);
		panel1.add(home);
		
		JLabel about=new JLabel("About Us");
		about.setBounds(1300, 0, 100, 50);
		about.setFont(fl);
		about.setForeground(Color.white);
		panel1.add(about);
		
		JLabel logout=new JLabel("Logout");
		logout.setBounds(1430, 0, 100, 50);
		logout.setFont(fl);
		logout.setForeground(Color.white);
		panel1.add(logout);
	    
	    panel3.setLayout(null);
	  //label
	  		JLabel l1=new JLabel("Full Name:");
	  		l1.setBounds(70, 100, 100, 100);
	  		l1.setForeground(Color.BLACK);
	  		l1.setFont(ft);
	  		panel3.add(l1);
	  		
	  		JLabel l2=new JLabel("Mobile Number:");
	  		l2.setBounds(70, 200, 200, 100);
	  		l2.setForeground(Color.BLACK);
	  		l2.setFont(ft);
	  		panel3.add(l2);
	  		
	  		JLabel l3=new JLabel("Email:");
	  		l3.setBounds(70, 300, 200, 100);
	  		l3.setForeground(Color.BLACK);
	  		l3.setFont(ft);
	  		panel3.add(l3);
	  		
	  		JLabel l4=new JLabel("Gender:");
	  		l4.setBounds(70, 400, 200, 100);
	  		l4.setForeground(Color.BLACK);
	  		l4.setFont(ft);
	  		//panel3.add(l4);
	  		
	  		JLabel l5=new JLabel("City:");
	  		l5.setBounds(70, 400, 200, 100);
	  		l5.setForeground(Color.BLACK);
	  		l5.setFont(ft);
	  		panel3.add(l5);
	  		
	  		JLabel l6=new JLabel("Choose the required services:");
	  		l6.setBounds(70, 560, 400, 100);
	  		l6.setForeground(Color.BLACK);
	  		l6.setFont(ft);
	  		panel3.add(l6);
	  		
	  		JLabel l7=new JLabel("When do you want this service ?:");
	  		l7.setBounds(70, 700, 400, 100);
	  		l7.setForeground(Color.BLACK);
	  		l7.setFont(ft);
	  		panel3.add(l7);
	  		
	  		JLabel l8=new JLabel("Number of guests:");
	  		l8.setBounds(70, 800, 400, 100);
	  		l8.setForeground(Color.BLACK);
	  		l8.setFont(ft);
	  		panel3.add(l8);
	  		
	  		JLabel l9=new JLabel("Choose meal type:");
	  		l9.setBounds(70, 900, 400, 100);
	  		l9.setForeground(Color.BLACK);
	  		l9.setFont(ft);
	  		panel3.add(l9);
	  		
	  		JLabel l10=new JLabel("Choose kitchen type:");
	  		l10.setBounds(70, 1000, 400, 100);
	  		l10.setForeground(Color.BLACK);
	  		l10.setFont(ft);
	  		panel3.add(l10);
	  		
	  		
	  		//fields
	  		final JTextField t1=new JTextField(20);
	  		t1.setBounds(70, 170, 400, 35);
	  		t1.setFont(fl);
	  		panel3.add(t1);
	  		
	  		final JTextField t2=new JTextField(20);
	  		t2.setBounds(70, 270, 400, 35);
	  		t2.setFont(fl);
	  		panel3.add(t2);
	  		
	  		final JTextField t3=new JTextField(20);
	  		t3.setBounds(70, 370, 400, 35);
	  		t3.setFont(fl);
	  		panel3.add(t3);
	  		
//	  		JCheckBox r1=new JCheckBox("male");
//	  		JLabel male=new JLabel("male");
//	  		male.setFont(s);
//	  		male.setBounds(95, 460, 50, 50);
//	  		male.setForeground(Color.white);
//	  		r1.setBounds(70, 475, 20, 20);
//	  		panel3.add(r1);
//	  		panel3.add(male);
	  		
//	  		JCheckBox r2=new JCheckBox("female");
//	  		JLabel female=new JLabel("female");
//	  		female.setFont(s);
//	  		female.setBounds(95, 485, 70, 50);
//	  		female.setForeground(Color.white);
//	  		r2.setBounds(70, 500, 20, 20);
//	  		panel3.add(r2);
//	  		panel3.add(female);
	  		
	  		ButtonGroup bg=new ButtonGroup();
	  		ButtonGroup bg1=new ButtonGroup();
	  		ButtonGroup bg2=new ButtonGroup();
	  		ButtonGroup bg3=new ButtonGroup();
//	  		bg.add(r1);
//	  		bg.add(r2);
	  		
	  		final JTextField area=new JTextField();
	  		area.setBounds(70, 470, 400, 50);
	  		area.setFont(fl);
	  		panel3.add(area);
	  		
	  		JRadioButton r3=new JRadioButton();
	  		JLabel lr3=new JLabel("Private Chef");
	  		lr3.setBounds(92, 624, 200, 50);
	  		lr3.setForeground(Color.BLACK);
	  		lr3.setFont(s);
	  		r3.setBounds(70, 640, 20, 20);
	  		panel3.add(r3);
	  		panel3.add(lr3);
	  		
	  		JRadioButton r4=new JRadioButton();
	  		JLabel lr4=new JLabel("Private Bartender");
	  		lr4.setBounds(92, 655, 200, 50);
	  		lr4.setForeground(Color.BLACK);
	  		lr4.setFont(s);
	  		r4.setBounds(70, 670, 20, 20);
	  		panel3.add(r4);
	  		panel3.add(lr4);
	  		
	  		JRadioButton r5=new JRadioButton();
	  		JLabel lr5=new JLabel("Caterering Solutions");
	  		lr5.setBounds(92, 685, 200, 50);
	  		lr5.setForeground(Color.BLACK);
	  		lr5.setFont(s);
	  		r5.setBounds(70, 700, 20, 20);
	  		panel3.add(r5);
	  		panel3.add(lr5);
	  		
	  		
	  		bg1.add(r3);
	  		bg1.add(r4);
	  		bg1.add(r5);
	  		
	        
	        final JDateChooser date1=new JDateChooser();
	  		date1.setBounds(70, 770, 150, 35);
	  		panel3.add(date1);
	  		
	  		
//	  		JDateChooser date=new JDateChooser();
//	  		date.setBounds(70, 870, 150, 35);
//	  		panel3.add(date);
	  		
	  		final JTextField NoOfGuest=new JTextField();
	  		NoOfGuest.setBounds(70, 870, 400, 35);
	  		panel3.add(NoOfGuest);
	    
	  		JRadioButton r6=new JRadioButton();
	  		JLabel lr6=new JLabel("Lunch");
	  		lr6.setBounds(92, 955, 200, 50);
	  		lr6.setForeground(Color.BLACK);
	  		lr6.setFont(s);
	  		r6.setBounds(70, 970, 20, 20);
	  		panel3.add(r6);
	  		panel3.add(lr6);
	  		
	  		JRadioButton r7=new JRadioButton();
	  		JLabel lr7=new JLabel("Dinner");
	  		lr7.setBounds(92, 985, 200, 50);
	  		lr7.setForeground(Color.BLACK);
	  		lr7.setFont(s);
	  		r7.setBounds(70, 1000, 20, 20);
	  		panel3.add(r7);
	  		panel3.add(lr7);
	  		bg2.add(r6);
	  		bg2.add(r7);;
	  		
	  		
	  		JRadioButton r8=new JRadioButton();
	  		JLabel lr8=new JLabel("Indoor Kitchen");
	  		lr8.setBounds(92, 1055, 200, 50);
	  		lr8.setForeground(Color.BLACK);
	  		lr8.setFont(s);
	  		r8.setBounds(70, 1070, 20, 20);
	  		panel3.add(r8);
	  		panel3.add(lr8);
	  		
	  		JRadioButton r9=new JRadioButton();
	  		JLabel lr9=new JLabel("Mobile Kitchen");
	  		lr9.setBounds(92, 1087, 200, 50);
	  		lr9.setForeground(Color.BLACK);
	  		lr9.setFont(s);
	  		r9.setBounds(70, 1100, 20, 20);
	  		panel3.add(r9);
	  		panel3.add(lr9);
	  		bg3.add(r8);
	  		bg3.add(r9);

	  		//button
	  		JButton btn=new JButton("Book My Chef");
	  		btn.setBounds(210, 1187, 200, 50);
	  		panel3.add(btn);
	  		
	  		
	  		
	  		//extra fields
	  		final JTextField f1=new JTextField();
	  		f1.setBounds(500, 620, 50, 25);
	  		//panel3.add(f1);
	  		
	  		final JTextField f2=new JTextField();
	  		f2.setBounds(500, 650, 50, 25);
	  		//panel3.add(f2);
	  		
	  		final JTextField f3=new JTextField();
	  		f3.setBounds(500, 680, 50, 25);
	  		//panel3.add(f3);
	  		
	  		home.addMouseListener(new MouseAdapter()  
		    {  
		        public void mouseClicked(MouseEvent e)  
		        { 
		          MainPage p=new MainPage();
		           p.setVisible(true);

		        }  
		    });
	  		
	  		about.addMouseListener(new MouseAdapter()  
		    {  
		        public void mouseClicked(MouseEvent e)  
		        { 
		          AboutUs p=new AboutUs();
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
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		//action of radiobutton
	  		r3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				f1.setText("Private Chef");
				}
				});
	  		
	  		r4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				f1.setText("Private Bartender");
				}
				});
	  		
	  		r5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				f1.setText("Caterering Solutions");
				}
				});
	  		
	  		r6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				f2.setText("Lunch");
				}
				});
	  		
	  		r7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				f2.setText("Dinner");
				}
				});
	  		
	  		r8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				f3.setText("Indoor Kitchen");
				}
				});
	  		
	  		r9.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				f3.setText("Mobile Kitchen");
				}
				});
	  		
	  		btn.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent ae)
			{
				String fullname = t1.getText();
				int phone=Integer.parseInt(t2.getText());
				 String email=t3.getText();
				 String city=area.getText();
	             String service=f1.getText();
	             String time=((JTextField) date1.getDateEditor().getUiComponent()).getText();
	             int guest=Integer.parseInt(NoOfGuest.getText());
	             String meal=f2.getText();
	             String kitchen=f3.getText();
	             
	             
	            
	            
			     
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookMyChef","root","root");
			if(con==null)
			{
			System.out.println("connection failed");
			}
			else
			{
			System.out.println("Database connected.....");

		//Statement stmt=con.createStatement();
			PreparedStatement pst=(PreparedStatement)con.prepareStatement("INSERT INTO orderpage (fullname, phone,email,city,service,day_and_date,No_of_guest,meal,kitchen) VALUES (?, ?, ?,?,?,?,?,?,?);");
		
			pst.setString(1,fullname);
			pst.setInt(2,phone);
			pst.setString(3,email);
			pst.setString(4,city);
			pst.setString(5,service);
			pst.setString(6,time);
			pst.setInt(7,guest);
			pst.setString(8,meal);
			pst.setString(9,kitchen);
			
			
			int row=pst.executeUpdate();
			 t1.setText("");
	         t2.setText("");
	         t3.setText("");
	         area.setText("");
	         date1.setToolTipText("");
	         f1.setText("");
	         f2.setText("");
	         f3.setText("");
	         NoOfGuest.setText("");
	         if (row > 0) {
	             JOptionPane.showMessageDialog(null, "Booking completed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
	         }
	         
	         
		 //rs=pst.executeQuery();
		//ResultSet rs2=stmt.executeQuery("INSERT INTO signup (firstname, lastname,email, password,phone,gender,address) VALUES (?, ?, ?,?,?,?,?)");

			
			con.close();
			}
			}
			catch(Exception e)
			{
			System.out.println(e);
			}


			}
	});
	  		
	  		
        //panel1.setLayout(null);
        container = new JLayeredPane();
     
		 JScrollPane jsp = new JScrollPane(container);
	        container.setPreferredSize(new Dimension(0, 2000));
	        container.setLayout(null);
	        
	   	 panel1.setBackground(new Color(0 , 0 ,153,100));
		 panel1.setBounds(0, 0, 1650, 100);
         container.add(panel1, new Integer(0), 0);
         
         panel2.setLayout(null);
         panel2.setBackground(new Color(255,102,102,40));
	        panel2.setBounds(0, 100, 1650, 1500);
	        container.add(panel2, new Integer(1), 0);
	        
	        panel3.setBackground(Color.white);
	        panel3.setBounds(430,175,650,1280);
	        container.add(panel3, new Integer(2), 0);
	        
	        panel4.setLayout(null);
	        panel4.setBackground(Color.gray);
	        panel4.setBounds(0, 1600, 1650, 400);
	        container.add(panel4, new Integer(3), 0);
         
  
       
	  
//	        
//	  		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//	  		frame.setUndecorated(true);
         
        frame.getContentPane().add(jsp);
        frame.setVisible(true);
	}
	public static void main(String[] args) {
new Order1();
	}

}
