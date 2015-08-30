/**
 * @(#)MyGUIPanel.java
 *
 *  A Panel is a rectangular area in which objects can be added and manipulated, and painting
 *  of graphics to the screen can be done using either the paint() or paintComponent() method.
 *  The call to the method "repaint();" re-calls the paintComponent() method (refreshes the screen)
 *
 * @author James De la Pena
 * @version 1.00 2015/5/7
 */

// The AWT and Swing Packages must be imported for GUI components
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyGUIPanel extends JPanel implements KeyListener, ActionListener
{
	// serial version UID: to avoid "warnings"
	private static final long serialVersionUID = 0L;

	// objects we will use in our panel
	private JButton aButton;
	private JLabel aLabel;

	// other information we will track in this panel


    // Constructor
    // Instantiate / initialize private variables (assign them starting/setup values)
    public MyGUIPanel()
    {
    	super();   // this calls the constructor of the JPanel class
    	setSize(800,600);
    	setBackground(Color.white);
    	setFocusable(true);
		addKeyListener(this);

		aButton = new JButton("This is a JButton");
		aButton.addActionListener(this);

		aLabel = new JLabel("This is a JLabel");

    	add(aButton);
    	add(aLabel);

        repaint();
    	setVisible(true);
    }

	// Code inside this method will execute when a call to "repaint()" is made, or when panels/frames
	// are first set visible
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);   // this first calls the paintComponent() method from the JPanel class

        aButton.setLocation(new Point(100,200));
    }

   // Code in this method is executed every time a key is pressed.
   public void keyPressed(KeyEvent e)
   {
   	if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
   	{
   		quitProgram();
   	}

   	repaint();
   }

    public void keyReleased(KeyEvent e)	{	}  // no code generally goes inside this required KeyListener method
    public void keyTyped(KeyEvent e) {    }    // no code generally goes inside this required KeyListener method

    private void quitProgram()
    {
    	JOptionPane.showMessageDialog(this, "Program will exit");
    	System.exit(0);
    }

    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource().equals(aButton))
    	{
    		JOptionPane.showMessageDialog(this, "Button Pressed");
    	}

        // add more "if" statements for functionality

        repaint();
    }
}