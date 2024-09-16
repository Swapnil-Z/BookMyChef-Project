package Practice_project;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
  
public class IconSwitcher {
public static void main(String[] args) throws MalformedURLException {
final Icon icon1 = new ImageIcon("hide-password.png");
final Icon icon2 = new ImageIcon("show-password.png");
final JButton btn = new JButton(icon1);
btn.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn.setIcon(btn.getIcon()==icon1? icon2 : icon1);
}
});
  
final JFrame f = new JFrame("IconSwitcher");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().add(btn);
EventQueue.invokeLater(new Runnable(){
public void run() {
f.pack();
f.setLocationRelativeTo(null);
f.setVisible(true);
}
});
}
}