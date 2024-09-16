package Practice_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Radiobutton extends JFrame {
	
	public Radiobutton() {
		JRadioButton r1=new JRadioButton("male");
		r1.setBounds(10,10,15, 15);
		add(r1);
		
		JRadioButton r2=new JRadioButton("female");
		r2.setBounds(30,10,15, 15);
		add(r2);
		
		final JTextField t1=new JTextField();
		t1.setBounds(100,10,70, 25);
		add(t1);
		
		r1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			t1.setText("hii");
			}
			});
		
		r2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			t1.setText("hello");
			}
			});
		
		setLayout(null);
setSize(500,500);
setVisible(true);

	}

	public static void main(String[] args) {
new Radiobutton();
	}

}
