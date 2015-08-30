/**
 * @(#)SpritePanel.java
 *
 *
 * @author
 * @version 1.00 2015/4/20
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SpritePanel extends JPanel implements KeyListener
{
	private static final long serialVersionUID = 0L;
	private Sprite myGuy;

    public SpritePanel()
    {
    	super();
    	setSize(800,600);
    	setBackground(new Color(0,0,0));
    	setFocusable(true);

		addKeyListener(this);

    	myGuy = new Sprite();
    	add(myGuy);

    	setVisible(true);
    	requestFocus();
    }

    public void paintComponent(Graphics g)
    {
    	setBackground(new Color(0,0,0));

    	g.translate(myGuy.getX(), myGuy.getY());
    	g.dispose();
    	//myGuy.setBounds(myGuy.getX(), myGuy.getY(), myGuy.getWidth(), myGuy.getHeight());
    	//update();
    	//repaint();
    }

	@SuppressWarnings("deprecation")
   public void keyPressed(KeyEvent e)
    {
    	if(e.getKeyCode() == KeyEvent.VK_LEFT)
    	{
    		myGuy.setX(myGuy.getX() - 5);
    		repaint();
    		update(getGraphics());

    	}

    	if(e.getKeyCode() == KeyEvent.VK_RIGHT)
    	{
    		myGuy.setX(myGuy.getX() + 5);
    		repaint();
    		update(getGraphics());

    	}

    	if(e.getKeyCode() == KeyEvent.VK_UP)
    	{
    		myGuy.setY(myGuy.getY() - 5);
    		repaint();
    		update(getGraphics());

    	}

    	if(e.getKeyCode() == KeyEvent.VK_DOWN)
    	{
    		myGuy.setY(myGuy.getY() + 5);
    		repaint();
    		update(getGraphics());

    	}
    	if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
    	{
    		JOptionPane.showMessageDialog(this, "Quitting");
    		System.exit(0);
    	}
    }

    public void keyReleased(KeyEvent e)
    {
    	repaint();
    }

    public void keyTyped(KeyEvent e) {    }


}