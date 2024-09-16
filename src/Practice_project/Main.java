package Practice_project;
import javax.swing.*;
import java.awt.*;
public class Main {
    private JFrame frame = new JFrame();
    private JLayeredPane lpane = new JLayeredPane();
    private JPanel panelBlue = new JPanel();
    private JPanel panelGreen = new JPanel();
    private JPanel container = new JPanel();
    JScrollPane jsp = new JScrollPane(container);
    public Main()
    {
    	Font fl=new Font("serif",Font.BOLD,30);
       frame.setPreferredSize(new Dimension(1650, 1080));
    	
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 1650, 1080);
        
        panelBlue.setBackground(Color.BLUE);
        panelBlue.setBounds(0, 0, 1650, 400);
       // panelBlue.setOpaque(true);
        
        panelGreen.setBackground(Color.GREEN);
        panelGreen.setBounds(0, 0, 1650, 100);
        //panelGreen.setOpaque(true);
        
//        container.setPreferredSize(new Dimension(0, 1080));
//        container.setLayout(null);
//        frame.getContentPane().add(jsp);
        
        lpane.add(panelBlue, new Integer(0), 0);
        lpane.add(panelGreen, new Integer(1), 0);
        frame.pack();
        frame.setVisible(true);
       
    }
    public static void main(String[] args) {
        new Main();
    }

}