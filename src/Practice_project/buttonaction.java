package Practice_project;
import javax.swing.*;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class buttonaction {
	final JButton btn=new JButton();
public buttonaction() {
	final JFrame frame=new JFrame();

	final JCheckBox ch=new JCheckBox("hi");
	ch.setBounds(10, 10, 50, 50);
	frame.add(ch);
//	
//	final JPasswordField p=new JPasswordField();
//	p.setBounds(50, 10, 100, 35);
//	frame.add(p);
	JDateChooser NoOfGuest=new JDateChooser();
		NoOfGuest.setBounds(50, 10, 100, 35);
		frame.add(NoOfGuest);

	
	
	
	
//	ch.addActionListener(new ActionListener(){
//		public void actionPerformed(ActionEvent e) {
//		if(ch.isSelected()) {
//			p.setEchoChar((char)0);
//		}else {
//			p.setEchoChar('*');
//		}
//		}
//		});
//	
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);
	
	
}
	
	
	
	public static void main(String[] args) {
new buttonaction();
	}

}
