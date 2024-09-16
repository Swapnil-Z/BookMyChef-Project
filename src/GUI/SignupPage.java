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
public class SignupPage extends JFrame {
	final Connection con=null;
	 Statement stmt=null;
	final ResultSet rs=null;
	final String q =null;
	protected PreparedStatement pst;
	public SignupPage() {
		

		//font
		Font f=new Font("serif",Font.BOLD,60);
		Font fl=new Font("serif",Font.BOLD,25);
		Font ft=new Font("serif",Font.BOLD,20);
		
		
		
//background image
		ImageIcon background_image=new ImageIcon("login_image.jpg");
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(1650,1080,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(-50,0,1650,1080);
		add(background);
		
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
		
		// update
		btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){

		 

//		     String firstname=t1.getText();
//		     String lastname=t1.getText();
//		     String email=t3.getText();
//		     String password=t4.getText();
//		     int p=Integer.parseInt(t2.getText());
//		     String gender=t6.getText();
//		     String address=t6.getText();

		     try {
            	 String url = "jdbc:mysql://localhost:3306/BookMyChef"; 
                 String user = "root"; 
                 String pass = "root";

                 // Declare Connection object
                 Connection connection = null;

                 try {
                     // Load MySQL JDBC driver (optional for recent versions)
                     Class.forName("com.mysql.cj.jdbc.Driver");

                     // Establish the connection
                     connection = DriverManager.getConnection(url, user, pass);

                     // Print a success message
                     System.out.println("Connection established successfully!");

                 } catch (Exception e1) {
                     // Handle case where the JDBC driver class is not found
                     System.err.println("JDBC Driver not found. Include the JDBC driver in your classpath.");
                     e1.printStackTrace();

                 }
            	
            	
                // Retrieve user input
                String firstname = t1.getText();
                String lastname=t2.getText();
                String email=t3.getText();
                String password=t4.getText();
                int phone=Integer.parseInt(t2.getText());
                String gender=t6.getText();
                String address=t6.getText();
               // String password = new String(passwordField.getPassword());
                
                //validation
                if (firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || password.isEmpty() || gender.isEmpty()|| address.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields must be filled out.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                    return; // Exit the method if validation fails
                }
            	
                
                String sql = "INSERT INTO signup (firstname, lastname,email, password,phone,gender,address) VALUES (?, ?, ?,?,?,?,?)";
                
                PreparedStatement preparedStatement = null;
              
					preparedStatement = connection.prepareStatement(sql);
					
					preparedStatement.setString(1, firstname);
		            preparedStatement.setString(2, lastname);
		            preparedStatement.setString(3, email);
		            preparedStatement.setString(4, password);
		            preparedStatement.setInt(5, phone);
		            preparedStatement.setString(6, gender);
		            preparedStatement.setString(7, address);

		            // Execute the insert operation
		            int rowsAffected = preparedStatement.executeUpdate();
		            
		            t1.setText("");
		            t2.setText("");
		            t3.setText("");
		            t4.setText("");
		            t5.setText("");
		            t6.setText("");
		            t7.setText("");
		            
		            //registration sucess
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Registration completed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
		            }
		         

		            // Print success message
		            System.out.println("Rows inserted: " + rowsAffected);
		            
		            
				

                // Perform login logic (for demonstration purposes, just printing values)
//                System.out.println("Email: " + email);
//                System.out.println("Password: " + password);

                // Here you can add validation or login logic
                // For example, check credentials, etc.
            }
            	catch (Exception e1) {
                    // Handle case where the JDBC driver class is not found
                    System.err.println("JDBC Driver not found. Include the JDBC driver in your classpath.");
                    e1.printStackTrace();

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
new SignupPage();
	}

}
