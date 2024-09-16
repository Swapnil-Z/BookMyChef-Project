package Practice_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class Test {

    private JFrame frame;

    public static void main(String[] args) {
    	Test window=new Test();
    	//window.frame.setVisible(true);
    }

  
    public Test() {
//    	JPanel header=new JPanel();
//    	header.setLayout(null);
//    	header.setSize(1650,50);
//    	header.setBackground(new Color(153,153,153,0));
//    	header.setBounds(0,0,1650,80);
    	
    	
    	
    	
    	frame = new JFrame("hi");
        frame.setBounds(0, 0, 1650, 1080);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//    	frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel container = new JPanel();
        JScrollPane jsp = new JScrollPane(container);
        container.setPreferredSize(new Dimension(0, 1080));
        container.setLayout(null);

        JLabel lblHelloWorld = new JLabel("Hello World");
        lblHelloWorld.setBounds(10, 11, 101, 14);
        container.add(lblHelloWorld);
        

        frame.getContentPane().add(jsp);
        frame.setVisible(true);
        //frame.add(header);
        
    }

 
  
}