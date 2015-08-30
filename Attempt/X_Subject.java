package gui_project;
import javax.swing.JTabbedPane;
class X_Subject extends JTabbedPane
{
	private final X_Panel[] panels;
	private final Quiz_Panel quiz;
	private final Interactive_Panel iPanel;
	public X_Subject(String subject)
	{
		super(TOP);
		panels = new X_Panel[]{new X_Panel(subject,"notes"),new X_Panel(subject,"formulas"),new X_Panel(subject,"terms")};
		iPanel = new Interactive_Panel();
		quiz = new Quiz_Panel(subject);
		addTab("Notes",panels[0]);
		addTab("Formulas",panels[1]);
		addTab("Terms",panels[2]);
		addTab("Interactive",iPanel);
		addTab("Quiz",quiz);
	}
	protected void addNotes(String[] t) //Currently only useful to pkg since it assumes the files exist...
	{
		panels[0].addRowsToTable(t);
	}
	protected void addFormulas(String[] t)
	{
		panels[1].addRowsToTable(t);
	}
	protected void addTerms(String[] t)
	{
		panels[2].addRowsToTable(t);
	}
	protected void addNote(String t)
	{
		panels[0].addRowToTable(t);
	}
	protected void addFormula(String t)
	{
		panels[1].addRowToTable(t);
	}
	protected void addTerm(String t)
	{
		panels[2].addRowToTable(t);
	}
}