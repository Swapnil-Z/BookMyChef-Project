package Practice_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ButtonImage extends JFrame  {
	final Icon icon1 = new ImageIcon("hide-password.png");
	final Icon icon2 = new ImageIcon("show-password.png");
	JFrame f=new JFrame("Button Example");
	
	public ButtonImage() {
		final JButton btn = new JButton(icon1);
		btn.setBounds(0, 0, 100, 50);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			btn.setIcon(btn.getIcon()==icon1? icon2 : icon1);
			if(btn.isSelected()) {
				
			}
			}
			});
		
		
	
		
		
		
		f.getContentPane().add(btn);
		f.setLayout(null);
		f.setSize(300,400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImage();
	}

}
