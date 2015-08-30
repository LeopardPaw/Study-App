package gui_project;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

class GUIProject_2 extends JFrame
{
	private final JTabbedPane mainPanel;
	private final ArrayList<X_Subject> tabs;
	public GUIProject_2()
	{
		super("ALIVE");
		mainPanel = new JTabbedPane();
		tabs = new ArrayList<X_Subject>();
		addSubjects(new String[]{"biology","physics","chemistry","mathematics"});
		tabs.get(0).addNotes(new String[]{"evolution","photosynthesis"});
		add(mainPanel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
	}
	protected void addSubjects(String[] t)
	{
		for(String x : t)
			addSubject(x);
	}
	protected void addSubject(String t)
	{
		tabs.add(new X_Subject(t));
		t = (t.length()>0)?t.substring(0,1).toUpperCase()+t.substring(1):t;
		mainPanel.addTab(t,tabs.get(tabs.size()-1));
	}
	public static void main(String[] args)
	{
		new GUIProject_2();
	}
}