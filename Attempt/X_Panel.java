package gui_project;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class X_Panel extends JPanel
{
	private ArrayList<JButton> table = new ArrayList<JButton>();
	private final String subject;
	private final String type;
	private final JPanel sm = new JPanel(new GridLayout(0,1));
	private final JTextArea text;
	public X_Panel(String subject,String type)
	{
		super(new BorderLayout());
		this.subject = subject;
		this.type = type;
		text = new JTextArea();
		text.setEditable(false);
		add(sm,BorderLayout.WEST);
		add(text,BorderLayout.CENTER);
	}
	public X_Panel(String subject,String type,String t)
	{
		super(new BorderLayout());
		addRowToTable(t);
		this.subject = subject;
		this.type = type;
		text = new JTextArea();
		text.setEditable(false);
		add(sm,BorderLayout.WEST);
		add(text,BorderLayout.CENTER);
	}
	public X_Panel(String subject,String type,String[] t)
	{
		super(new BorderLayout());
		addRowsToTable(t);
		this.subject = subject;
		this.type = type;
		text = new JTextArea();
		text.setEditable(false);
		add(sm,BorderLayout.WEST);
		add(text,BorderLayout.CENTER);
	}
	public JTextArea getTextArea()
	{
		return text;
	}
	protected void addRowToTable(final String t)
	{
		table.add(new JButton(new AbstractAction(t)
			{ 
				@Override 
				public void actionPerformed(ActionEvent e)
				{
					text.setText("");
					BufferedReader temp = null;
					try
					{
						temp = new BufferedReader(new FileReader(new File(type+File.separator+subject+File.separator+t+".txt")));
						String i;
						while((i = temp.readLine()) != null)
							text.append(i+"\n");
					}
					catch(IOException f){}
				}
			}));
		sm.add(table.get(table.size()-1));
	}
	protected void addRowsToTable(String[] t)
	{
		for(String s:t)
			addRowToTable(s);
	}
}