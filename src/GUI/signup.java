package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class signup extends JFrame {
	final Connection con=null;
	 Statement stmt=null;
	final ResultSet rs=null;
	final String q =null;
	protected PreparedStatement pst;
	public signup() {
		

		//font
		Font f=new Font("serif",Font.BOLD,60);
		Font fl=new Font("serif",Font.BOLD,25);
		Font ft=new Font("serif",Font.BOLD,20);
		
		JLabel name=new JLabel("SIGNUP PAGE");
		name.setForeground(Color.BLACK);
		name.setBounds(600,20,600,50);
		name.setFont(f);
	    name.setForeground(Color.black);
		add(name);
		
		
		
//background image
		ImageIcon background_image=new ImageIcon("login_image.jpg");
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(1650,1080,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(-50,0,1650,1080);
		add(background);
		
		//logo
		ImageIcon background_image1=new ImageIcon("logo.png");
		Image img1=background_image1.getImage();
		Image temp_img1=img1.getScaledInstance(100,90,Image.SCALE_SMOOTH);
		background_image1=new ImageIcon(temp_img1);
		JLabel background1=new JLabel("",background_image1,JLabel.CENTER);
		background1.setBounds(60,10,100,90);
		background.add(background1);
		
		
		//header
		JPanel header=new JPanel();
		header.setLayout(null);
		header.setSize(1650,50);
		header.setBackground(new Color(153,153,153,50));
		header.setBounds(0,0,1650,110);
		background.add(header);
		
		JPanel login=new JPanel();
		login.setLayout(null);
		login.setSize(700,350);
		login.setBackground(new Color(248,248,255,100));
		login.setBounds(370,175,650,550);
		background.add(login);
		

		//labels
		JLabel l1=new JLabel("First Name:");
		l1.setBounds(80,-190,500,500);
		l1.setFont(fl);
		l1.setForeground(Color.black);
		
		JLabel l2=new JLabel("Last Name:");
		l2.setBounds(80,-120,500,500);
		l2.setFont(fl);
		l2.setForeground(Color.black);
		
		JLabel l3=new JLabel("Email ID:");
		l3.setBounds(80,-50,500,500);
		l3.setFont(fl);
		l3.setForeground(Color.black);
		
		JLabel l4=new JLabel("Password:");
		l4.setBounds(80,20,500,500);
		l4.setFont(fl);
		l4.setForeground(Color.black);
		
		JLabel l5=new JLabel("Phone No:");
		l5.setBounds(80,90,500,500);
		l5.setFont(fl);
		l5.setForeground(Color.black);
		
		JLabel l6=new JLabel("Gender:");
		l6.setBounds(80,160,500,500);
		l6.setFont(fl);
		l6.setForeground(Color.black);
		
		JLabel l7=new JLabel("Address:");
		l7.setBounds(80,230,500,500);
		l7.setFont(fl);
		l7.setForeground(Color.black);
		
		//textfield
		final JTextField t1=new JTextField();
		t1.setBounds(205,45,250,30);
		t1.setFont(ft);
		
		final JTextField t2=new JTextField();
		t2.setBounds(205,110,250,30);
		t2.setFont(ft);
		
		final JTextField t3=new JTextField();
		t3.setBounds(205,180,250,30);
		t3.setFont(ft);
		

		final JPasswordField t4=new JPasswordField();
		t4.setBounds(205,250,250,30);
		t4.setFont(ft);
		
		final JTextField t5=new JTextField();
		t5.setBounds(205,320,250,30);
		t5.setFont(ft);
		
		final JCheckBox password=new JCheckBox();
		password.setBounds(205,290,15,15);
		
		final JLabel pwd=new JLabel("show password");
		pwd.setBounds(230,285,100,20);
		
		final JTextField t6=new JTextField();
		t6.setBounds(205,385,250,30);
		t6.setFont(ft);
		
		final JTextField t7=new JTextField();
		t7.setBounds(205,460,250,30);
		t7.setFont(ft);
		
		final JButton btn=new JButton("signup");
		btn.setBounds(260,510,100,30);
		
		
		final JPasswordField p1=new JPasswordField();
		p1.setBounds(320,205,225,35);
		p1.setFont(fl);
		login.add(l1);
		login.add(l2);
		login.add(l3);
		login.add(l4);
		login.add(l5);
		login.add(l6);
		login.add(l7);
		login.add(t1);
		login.add(t2);
		login.add(t3);
		login.add(t4);
		login.add(t5);
		login.add(t6);
		login.add(t7);
		login.add(password);
		login.add(pwd);
		login.add(btn);
		
//		login.add(p1);
		
		password.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			if(password.isSelected()) {
				t4.setEchoChar((char)0);
			}else {
				t4.setEchoChar('*');
			}
			}
			});
		
		btn.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
			String firstname = t1.getText();
            String lastname=t2.getText();
            String email=t3.getText();
            String password=t4.getText();
            int phone=Integer.parseInt(t5.getText());
            String gender=t6.getText();
            String address=t7.getText();
		     
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
		PreparedStatement pst=(PreparedStatement)con.prepareStatement("INSERT INTO signup (firstname, lastname,email, pwd,phone,gender,address) VALUES (?, ?, ?,?,?,?,?);");
	
		pst.setString(1,firstname);
		pst.setString(2,lastname);
		pst.setString(3,email);
		pst.setString(4,password);
		pst.setInt(5,phone);
		pst.setString(6,gender);
		pst.setString(7,address);
		int row=pst.executeUpdate();
		 t1.setText("");
         t2.setText("");
         t3.setText("");
         t4.setText("");
         t5.setText("");
         t6.setText("");
         t7.setText("");
         if (row > 0) {
             JOptionPane.showMessageDialog(null, "Registration completed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
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
		
		
		
		//main frame
		setSize(1650,1080);
		setLayout(null);
//		setExtendedState(JFrame.MAXIMIZED_BOTH); 
//		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
new signup();
	}

}
