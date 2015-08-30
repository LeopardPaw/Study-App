/**
 * @(#)MainFrame.java
 *
 *
 * @author
 * @version 1.00 2015/4/20
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame
{
	private static final long serialVersionUID = 0L;
    /**
     * Creates a new instance of <code>MainFrame</code>.
     */
    public MainFrame()
    {
    	super("Using keys to move Objects");
    	setSize(800,600);
    	setBackground(Color.white);
    	// initialize (set-up) our Sprite object myGuy

        Container pane = getContentPane();
		pane.add(new SpritePanel());
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new MainFrame();
    }
}
