import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class LayoutCombo implements ActionListener
    {
    private JFrame frame;
    private JPanel panelLeft, panelRight;
    private JLabel label;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8;
    private JTextArea textArea;
    private JScrollPane scrollArea;
 
    public static void main (String[] args)
        {
        LayoutCombo guiLayout = new LayoutCombo();
        guiLayout.start();
        }
 
    public void start()
        {
        frame = new JFrame("Border and Box Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
 
        label = new JLabel("Use the buttons to control the layout of the text you type");
        contentPane.add(label, BorderLayout.NORTH);
 
        panelLeft = new JPanel();
        panelLeft.setLayout(new BoxLayout(panelLeft,BoxLayout.Y_AXIS));
 
        button1 = new JButton("Wrap Text             ");
        button1.addActionListener(this);
        panelLeft.add(button1);
        button2 = new JButton("Do Not Wrap Text");
        button2.addActionListener(this);
        panelLeft.add(button2);
        button3 = new JButton("                                 ");
        button3.addActionListener(this);
        panelLeft.add(button3);
        button4 = new JButton("Clear Text             ");
        button4.addActionListener(this);
        panelLeft.add(button4);

        contentPane.add(panelLeft, BorderLayout.WEST);
        
        panelRight = new JPanel();
        panelRight.setLayout(new BoxLayout(panelRight,BoxLayout.Y_AXIS));
        
        button5 = new JButton("Scroll Vertically     ");
        button5.addActionListener(this);
        panelRight.add(button5);
        button6 = new JButton("Scroll Horizontally ");
        button6.addActionListener(this);
        panelRight.add(button6);
        button7 = new JButton("Scroll Both Ways  ");
        button7.addActionListener(this);
        panelRight.add(button7);
        button8 = new JButton("Do Not Scroll          ");
        button8.addActionListener(this);
        panelRight.add(button8);
       
        contentPane.add(panelRight, BorderLayout.EAST);
 
        textArea = new JTextArea(10,25);
        scrollArea = new JScrollPane(textArea);
        scrollArea.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollArea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        contentPane.add(scrollArea, BorderLayout.CENTER);
 
        frame.pack();
        frame.setVisible(true);
        }
 
    public void actionPerformed(ActionEvent e)
        {
        if (e.getSource() == button1)
            textArea.append("Button 1 was clicked.\n");
        else if (e.getSource() == button2)
            textArea.append("Button 2 was clicked.\n");
        else if (e.getSource() == button3)
            textArea.append("Button 3 was clicked.\n");
        else if (e.getSource() == button4)
            textArea.append("Button 4 was clicked.\n");
        else if (e.getSource() == button5)
            textArea.append("Button 5 was clicked.\n");
        else if (e.getSource() == button6)
	        textArea.append("Button 6 was clicked.\n");
	    else if (e.getSource() == button7)
	        textArea.append("Button 7 was clicked.\n");
	    else if (e.getSource() == button8)
	        textArea.append("Button 8 was clicked.\n");
        else
            textArea.append("Should not get here!\n");
        }
    }