package Practice_project;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

public class ActionExample extends JFrame implements ActionListener
{

private JButton testButton;
private int test =1;
private ImageIcon testButtonIcon2;

public void init()
{
ImageIcon testButtonIcon1 = new ImageIcon("show-password.png");
testButtonIcon2 = new ImageIcon("hide-password.png");

setLayout(new FlowLayout());
// testButton = new JButton("Test");
//testButton.setBackground(Color.blue);

testButton = new JButton(testButtonIcon1);
add(testButton);

testButton.addActionListener(this);

}


public void paint(Graphics g)
{

testButton.setBackground(Color.blue);
if(test != 1) {
//testButton.setBackground(Color.orange);
testButton.setIcon(testButtonIcon2);
}

}

public void actionPerformed(ActionEvent evt)
{

if (evt.getSource() == testButton)
test++;
repaint();
}

}