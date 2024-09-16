package JDBC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Connection1 {

	public static void main(String[] args) {
	try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookMyChef","root","root");

System.out.println("connection done");
con.close();
}
	catch(Exception e)
{
System.out.println(e);
}
}
}





