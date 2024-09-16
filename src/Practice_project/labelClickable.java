package Practice_project;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import GUI.LoginPage;

public class labelClickable extends JFrame {
	public labelClickable() {
	
JFrame frame=new JFrame();

JLabel l=new JLabel("hi");
l.setBounds(0, 0, 150, 50);
frame.add(l);
frame.setSize(500,500);
frame.setLayout(null);
frame.setVisible(true);

l.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    { 
      LoginPage p=new LoginPage();
       p.setVisible(true);

    }  
}); 
}

	public static void main(String[] args) {
new labelClickable();
	}

}
