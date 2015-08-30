/**
 * @(#)MyGUIFrame.java
 *
 *  All GUI programs must have a frame.  Frames can use method calls to set their size, background color, etc.
 *  In our frame, we can add a menu bar, with menus and menu items.  We also want to add at least one panel
 *  inside of our Frame.
 *
 * @author James De la Pena
 * @version 1.00 2015/5/7
 */

// The AWT and Swing Packages must be imported for GUI components
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// These imports allow us to use an ArrayList
import java.util.List;
import java.util.ArrayList;

public class MyGUIFrame extends JFrame implements ActionListener
{
	// the variable "serialVersionUID" is used to avoid any "warning" messages when compiling
	private static final long serialVersionUID = 0L;

	// All other instance variables should be declared here, before the constructor.
	// These are the objects we will need to work with in this particular file (our frame)
	private JMenuBar mBar;
	private JMenu menu;
	private List<JMenuItem> items;

    // Constructor
    // Instantiate / initialize private variables (assign them starting/setup values)
    public MyGUIFrame()
    {
    	super("Title Bar Text");
    	setSize(800,600);

    	mBar = new JMenuBar();
    	menu = new JMenu("File");

    	items = new ArrayList<JMenuItem>();

    	items.add(new JMenuItem("Help", KeyEvent.VK_T));
		items.get(0).setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		items.get(0).addActionListener(this);
    	menu.add(items.get(0));

    	items.add(new JMenuItem("Quit", KeyEvent.VK_T));
		items.get(1).setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		items.get(1).addActionListener(this);
    	menu.add(items.get(1));

    	mBar.add(menu);
    	setJMenuBar(mBar);

		getContentPane().add(new MyGUIPanel());

    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource().equals(items.get(0)))  // items.get(0) is the JMenuItem labeled "Help"
    	{
    		// this code executes when "Help" is selected
    	}

    	if(e.getSource().equals(items.get(1)))  // items.get(1) is the JMenuItem labeled "Quit"
    	{
    		// this code executes when "Quit" is selected
    	}

        // add more "if" statements for functionality

    }

    // The main method here is very short.  It simply makes a new constructor call to "MyGUIFrame()"
    // This executes the code in the constructor.
    public static void main(String[] args)
    {
        new MyGUIFrame();
    }
}
