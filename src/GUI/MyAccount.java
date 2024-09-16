package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;
public class MyAccount extends JFrame{
public MyAccount() {
JFrame frame=new JFrame("My Account");
frame.setBounds(500, 200, 500, 500);
frame.setLayout(null);

JLabel email=new JLabel("Email ID:");
email.setBounds(70, 70, 100, 100);
frame.add(email);

JLabel password=new JLabel("New Password:");
password.setBounds(70, 130, 100, 100);
frame.add(password);

final JTextField t1=new JTextField();
t1.setBounds(157, 100, 250, 35);
frame.add(t1);

final JTextField t2=new JTextField();
t2.setBounds(157, 160, 250, 35);
frame.add(t2);

JButton btn=new JButton("Upadte");
btn.setBounds(120, 250, 120, 35);
frame.add(btn);


JButton btn2=new JButton("Delete");
btn2.setBounds(260, 250, 120, 35);
frame.add(btn2);

btn.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
	String email = t1.getText();
    String password=t2.getText();
  
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
PreparedStatement pst=(PreparedStatement)con.prepareStatement("UPDATE signup SET pwd=? WHERE email=?;");

pst.setString(2,email);
pst.setString(1,password);
int row=pst.executeUpdate();
 t1.setText("");
 t2.setText("");

 if (row > 0) {
     JOptionPane.showMessageDialog(null, "Password change successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
 }else {
	 JOptionPane.showMessageDialog(null, "Wrong email Id please check again!", "failed", JOptionPane.INFORMATION_MESSAGE);
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


btn2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
	String email = t1.getText();
    //String password=t2.getText();
  
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
PreparedStatement pst=(PreparedStatement)con.prepareStatement("DELETE FROM signup  WHERE email=?;");

pst.setString(1,email);

int row=pst.executeUpdate();
 t1.setText("");
 t2.setText("");

 if (row > 0) {
     JOptionPane.showMessageDialog(null, "Account Deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
 }else {
	 JOptionPane.showMessageDialog(null, "Wrong email Id please check again!", "failed", JOptionPane.INFORMATION_MESSAGE);
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



frame.setVisible(true);
}
	
	
	public static void main(String[] args) {
new MyAccount();
	}

}
