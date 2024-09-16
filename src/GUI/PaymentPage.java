package GUI;
import javax.swing.*;

import JDBC.MainPage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PaymentPage extends JFrame {
	JFrame frame;
	 private JLayeredPane container = new JLayeredPane();
	 private JPanel panel2 = new JPanel();
	 private JPanel panel=new JPanel();
	public PaymentPage() {
		Font fl=new Font("serif",Font.BOLD,20);
		
		frame = new JFrame("Payment Page");
		frame.setBounds(0, 0, 1650, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon background_image=new ImageIcon("payment.png");
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(1650,1080,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1650,1080);
		//add(background);
		
		
		//logo
				ImageIcon background_image5=new ImageIcon("logo.png");
				Image img5=background_image5.getImage();
				Image temp_img5=img5.getScaledInstance(100,90,Image.SCALE_SMOOTH);
				background_image5=new ImageIcon(temp_img5);
				JLabel background5=new JLabel("",background_image5,JLabel.CENTER);
				background5.setBounds(10,10,100,90);
				
				JLabel home=new JLabel("Home");
				home.setBounds(1300, 0, 70, 50);
				home.setFont(fl);
				home.setForeground(Color.white);
				
				JLabel logout=new JLabel("Logout");
				logout.setBounds(1400, 0, 70, 50);
				logout.setFont(fl);
				logout.setForeground(Color.white);
				
				//labels
				JLabel l1=new JLabel("Full Name:");
				l1.setBounds(80,-90,500,500);
				l1.setFont(fl);
				l1.setForeground(Color.black);
				panel2.add(l1);
				
				JLabel l2=new JLabel("Phone Number:");
				l2.setBounds(80,-10,500,500);
				l2.setFont(fl);
				l2.setForeground(Color.black);
				panel2.add(l2);
				
				JLabel l3=new JLabel("Email Id:");
				l3.setBounds(80,70,500,500);
				l3.setFont(fl);
				l3.setForeground(Color.black);
				panel2.add(l3);
				
				JLabel l4=new JLabel("Payment Gateway:");
				l4.setBounds(80,160,500,500);
				l4.setFont(fl);
				l4.setForeground(Color.black);
				panel2.add(l4);
				
				final JTextField t1=new JTextField(20);
				t1.setBounds(80,180,250,30);
				t1.setFont(fl);
				panel2.add(t1);
				
				final JTextField t2=new JTextField(20);
				t2.setBounds(80,255,250,30);
				t2.setFont(fl);
				panel2.add(t2);
				
				final JTextField t3=new JTextField(20);
				t3.setBounds(80,335,250,30);
				t3.setFont(fl);
				panel2.add(t3);
				
			JRadioButton r1=new JRadioButton();
			JLabel lr1=new JLabel("QR");
			lr1.setBounds(100,419,50,50);
			r1.setBounds(80,435,15,17);
//			panel2.add(r1);
//			panel2.add(lr1);
//			
			JRadioButton r2=new JRadioButton();
			r2.setBounds(150,436,15,17);
			//panel2.add(r2);
			JLabel lr2=new JLabel("Cash");
			lr2.setBounds(170,419,50,50);
			//panel2.add(lr2);
			String s1[]={"--None--","cash","QR"};
			final JComboBox cb=new JComboBox(s1);
			cb.setBounds(80,422,70,25);
			panel2.add(cb);
			
			final ButtonGroup bg=new ButtonGroup();
			bg.add(r1);
			bg.add(r2);
			
			JButton btn=new JButton("Pay");
			btn.setBounds(170,480,60,30);
			panel2.add(btn);
			
	
		
		
		container = new JLayeredPane();
		JScrollPane jsp = new JScrollPane(container);
	    container.setPreferredSize(new Dimension(0, 190));
	    container.setLayout(null);
	    
	    panel.setLayout(null);
        panel.setBackground(new Color(255,255,204,100));
        panel.setBounds(0, 0, 1600, 100);
        container.add(panel, new Integer(0), 0);
        
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,255,153,100));
        panel2.setBounds(370,175,650,550);
        container.add(panel2, new Integer(1), 0);
        
        
        panel.add(background5);
        panel.add(home);
        panel.add(logout);
	    
        
        //adding on panel
       // panel.add(background5);
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
        
        
        btn.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
			String fullname = t1.getText();
			int phone=Integer.parseInt(t2.getText());
            String email=t3.getText();
            String payment=(String) cb.getSelectedItem();
            
            
           
		     
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
		PreparedStatement pst=(PreparedStatement)con.prepareStatement("INSERT INTO payment (fullname, phone,email, payment) VALUES (?, ?, ?,?);");
	
		pst.setString(1,fullname);
		pst.setInt(2,phone);
		pst.setString(3,email);
	    pst.setString(4,payment);
		

		pst.executeUpdate();
		 t1.setText("");
         t2.setText("");
         t3.setText("");
        
		
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
    	frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    	frame.setUndecorated(true);
        
	    container.add(background);
	    frame.getContentPane().add(jsp);
        frame.setVisible(true);
		
	}
	
	
	
	

	public static void main(String[] args) {
new PaymentPage();
	}

}
