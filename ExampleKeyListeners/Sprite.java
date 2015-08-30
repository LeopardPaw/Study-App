/**
 * @(#)Sprite.java
 *
 * This is a JLabel which contains an image of our "guy".
 *
 * @author
 * @version 1.00 2015/4/20
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Sprite extends JLabel
{
	private static final long serialVersionUID = 0L;
	private int myX;
	private int myY;
	private ImageIcon pic;

    public Sprite()  //constructor
    {
    	super();

    	myX = myY = 0;
    	// initialize myX and myY as the starting position (myX, myY) of our sprite
    	
    	pic = new ImageIcon("guy.jpg");
    	setIcon(pic);
    }
    
   	public int getX()
   	{
   		return myX;
   	}
	public int getY()
	{
		return myY;
	}
	
	public void setX(int x)
	{
		myX = x;
	}
	
	public void setY(int y)
	{
		myY = y;
	}

 

}