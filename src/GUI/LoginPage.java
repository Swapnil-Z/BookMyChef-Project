package GUI;
import java.sql.*;
import javax.sql.rowset.serial.SerialJavaObject;
import javax.swing.*;

import JDBC.MainPage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class LoginPage extends JFrame{
	final Icon icon1 = new ImageIcon("hide-password.png");
	final Icon icon2 = new ImageIcon("show-password.png");
public LoginPage() {
	final Connection con=null;
	 Statement stmt=null;
	final ResultSet rs=null;
	final String q =null;
	
	
	//font declaration
	Font f=new Font("serif",Font.BOLD,60);
	Font fl=new Font("serif",Font.BOLD,30);
	Font ft=new Font("serif",Font.BOLD,20);
	//label for heading
	JLabel name=new JLabel("LOGIN PAGE");
	name.setForeground(Color.BLACK);
	name.setBounds(600,20,400,50);
	name.setFont(f);
    name.setForeground(Color.black);
	add(name);
	
	  JLabel logout=new JLabel("SignUp");
      logout.setBounds(1400, 0, 120, 50);
      logout.setFont(fl);
      logout.setForeground(Color.white);
      add(logout);
	
	//labels
	JLabel l1=new JLabel("Email ID:");
	l1.setBounds(80,-110,500,500);
	l1.setFont(fl);
	l1.setForeground(Color.WHITE);
	
	JLabel l2=new JLabel("PASSWORD:");
	l2.setBounds(80,-25,500,500);
	l2.setFont(fl);
	l2.setForeground(Color.WHITE);
	JLabel pw=new JLabel("show password");
	JLabel forget=new JLabel("Forget Password?");
	forget.setBounds(470, 232, 120, 50);
	forget.setForeground(Color.white);
	pw.setBounds(340, 232, 100, 50);
	pw.setForeground(Color.white);
	final JCheckBox password =new JCheckBox();
	
	password.setBounds(320, 250, 17, 15);
	
	//textfield
	final JTextField t1=new JTextField();
	t1.setBounds(320,120,250,35);
	t1.setFont(fl);
	
	final JPasswordField p1=new JPasswordField();
	p1.setBounds(320,205,250,35);
	p1.setFont(fl);
	

	//buttons
	
	final JButton btn = new JButton("Submit");
	btn.setBounds(350,305,80, 35);
	
	final JButton clear = new JButton("Clear");
	clear.setBounds(450,305,80, 35);

	
	
	
	ImageIcon background_image=new ImageIcon("login_image.jpg");
	Image img=background_image.getImage();
	Image temp_img=img.getScaledInstance(1650,1080,Image.SCALE_SMOOTH);
	background_image=new ImageIcon(temp_img);
	JLabel background=new JLabel("",background_image,JLabel.CENTER);
	background.setBounds(0,0,1650,1080);
	add(background);
	
	//logo
	ImageIcon background_image1=new ImageIcon("logo.png");
	Image img1=background_image1.getImage();
	Image temp_img1=img1.getScaledInstance(100,90,Image.SCALE_SMOOTH);
	background_image1=new ImageIcon(temp_img1);
	JLabel background1=new JLabel("",background_image1,JLabel.CENTER);
	background1.setBounds(10,10,100,90);
	background.add(background1);
	//header
	JPanel header=new JPanel();
	header.setLayout(null);
	header.setSize(1650,50);
	header.setBackground(new Color(153,153,153,50));
	header.setBounds(0,0,1650,110);
	background.add(header);

	//login panel
	JPanel login=new JPanel();
	login.setLayout(null);
	login.setSize(700,350);
	login.setBackground(new Color(0,0,0,70));
	login.setBounds(370,175,650,550);
	background.add(login);
	login.add(l1);
	login.add(l2);
	login.add(t1);
	login.add(p1);
	login.add(password);
	login.add(pw);
	login.add(forget);
	login.add(btn);
	login.add(clear);
	
	//login.add(btn);
	
	password.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		if(password.isSelected()) {
			p1.setEchoChar((char)0);
		}else {
			p1.setEchoChar('*');
		}
		}
		});
	
	forget.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        { 
          ForgetFrame p=new ForgetFrame();
           p.setVisible(true);

        }  
    }); 
	
	clear.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
	     t1.setText("");
	     p1.setText("");

	}
	});
	
	
	
	
	
	
	btn.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
	     String username=t1.getText();
	     String password=p1.getText();
	     
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

Statement stmt=con.createStatement();
//	PreparedStatement pst=(PreparedStatement)con.prepareStatement("select *from login where email=? and pwd=?");
//
//	pst.setString(1,username);
//	pst.setString(2,password);
//	 rs=pst.executeQuery();
	ResultSet rs2=stmt.executeQuery("select * from signup where email='"+username+"'and pwd ='"+password+"';");

	if(rs2.next())
	{
	//open new frame
		dispose();
	  MainPage m=new MainPage();
	  m.setVisible(true);
	  
	  
	}

	else
	{
	JFrame f=new JFrame();
	JOptionPane.showMessageDialog(f,"Invalid Username or Password ");

	}
	con.close();
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}


	}
});
	logout.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        { 
          signup p=new signup();
           p.setVisible(true);

        }  
    });
	
	//main frame
	setSize(1650,1080);
	setLayout(null);
//	setExtendedState(JFrame.MAXIMIZED_BOTH); 
//	setUndecorated(true);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
new LoginPage();
	}

}
