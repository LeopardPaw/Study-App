import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;

class GUIProject extends JFrame// implements ChangeListener
{
	private JTabbedPane tabs,bTabs,pTabs,cTabs,mTabs;
	private JPanel bNotes,bFormulas,bTerms,bInteractive,bQuiz,pNotes,pFormulas,pTerms,pInteractive,pQuiz,cNotes,cFormulas,cTerms,cInteractive,cQuiz,mNotes,mFormulas,mTerms,mInteractive,mQuiz,quiz;
	private JTable bTable,bTable2,bTable3,pTable,pTable2,pTable3,cTable,cTable2,cTable3,mTable,mTable2,mTable3;
	private JTextArea bio_n,bio_f,bio_t,physics_n,physics_f,physics_t,chem_n,chem_f,chem_t,math_n,math_f,math_t;
	private DefaultTableModel bNModel,bFModel,bTModel,pNModel,pFModel,pTModel,cNModel,cFModel,cTModel,mNModel,mFModel,mTModel;
	//private ArrayList<DefaultTableModel> tableModels;
	private ArrayList<JTable> tables;
	private JScrollPane pane_b1,pane_b2,pane_b3,pane_p1,pane_p2,pane_p3,pane_c1,pane_c2,pane_c3,pane_m1,pane_m2,pane_m3;
	public GUIProject()
	{
		super();
		initTextAreas();
		initModels();
		add(tabs);
		addNotes("biology",new String[]{"Evolution","Cells","Ecology"});
		//addNote("biology","Evolution");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	protected void initPanels()
	{
		bNotes = new JPanel(new BorderLayout());
		bNotes.add(pane_b1,BorderLayout.WEST);
		bNotes.add(bio_n,BorderLayout.CENTER);
		bFormulas = new JPanel(new BorderLayout());
		bFormulas.add(pane_b2,BorderLayout.WEST);
		bFormulas.add(bio_f,BorderLayout.CENTER);
		bTerms = new JPanel(new BorderLayout());
		bTerms.add(pane_b3,BorderLayout.WEST);
		bTerms.add(bio_t,BorderLayout.CENTER);
		bInteractive = new JPanel(new BorderLayout());
		bQuiz = new JPanel(new BorderLayout());
		pNotes = new JPanel(new BorderLayout());
		pNotes.add(pane_p1,BorderLayout.WEST);
		pNotes.add(physics_n,BorderLayout.CENTER);
		pFormulas = new JPanel(new BorderLayout());
		pFormulas.add(pane_p2,BorderLayout.WEST);
		pFormulas.add(physics_f,BorderLayout.CENTER);
		pTerms = new JPanel(new BorderLayout());
		pTerms.add(pane_p3,BorderLayout.WEST);
		pTerms.add(physics_t,BorderLayout.CENTER);
		pInteractive = new JPanel(new BorderLayout());
		pQuiz = new JPanel(new BorderLayout()); 
		cNotes = new JPanel(new BorderLayout());
		cNotes.add(pane_c1,BorderLayout.WEST);
		cNotes.add(chem_n,BorderLayout.CENTER);
		cFormulas = new JPanel(new BorderLayout());
		cFormulas.add(pane_c2,BorderLayout.WEST);
		cFormulas.add(chem_f,BorderLayout.CENTER);
		cTerms = new JPanel(new BorderLayout());
		cTerms.add(pane_c3,BorderLayout.WEST);
		cTerms.add(chem_t,BorderLayout.CENTER);
		cInteractive = new JPanel(new BorderLayout());
		cQuiz = new JPanel(new BorderLayout());
		mNotes = new JPanel(new BorderLayout());
		mNotes.add(pane_m1,BorderLayout.WEST);
		mNotes.add(math_n,BorderLayout.CENTER);
		mFormulas = new JPanel(new BorderLayout());
		mFormulas.add(pane_m2,BorderLayout.WEST);
		mFormulas.add(math_f,BorderLayout.CENTER);
		mTerms = new JPanel(new BorderLayout());
		mTerms.add(pane_m3,BorderLayout.WEST);
		mTerms.add(math_t,BorderLayout.CENTER);
		mInteractive = new JPanel(new BorderLayout());
		mQuiz = new JPanel(new BorderLayout());
		quiz=new JPanel(new BorderLayout());
		initTabs();
	}
	protected void initModels()
	{
		bNModel = new DefaultTableModel();
		bFModel = new DefaultTableModel();
		bTModel = new DefaultTableModel();
		pNModel = new DefaultTableModel();
		pFModel = new DefaultTableModel();
		pTModel = new DefaultTableModel();
		cNModel = new DefaultTableModel();
		cFModel = new DefaultTableModel();
		cTModel = new DefaultTableModel();
		mNModel = new DefaultTableModel();
		mFModel = new DefaultTableModel();
		mTModel = new DefaultTableModel();
		initTables();
	}
	protected void initScrollPanes()
	{
		pane_b1 = new JScrollPane(bTable);
		bTable.setFillsViewportHeight(true);
		pane_b2 = new JScrollPane(bTable2);
		bTable2.setFillsViewportHeight(true);
		pane_b3 = new JScrollPane(bTable3);
		bTable3.setFillsViewportHeight(true);
		pane_p1 = new JScrollPane(pTable);
		pTable.setFillsViewportHeight(true);
		pane_p2 = new JScrollPane(pTable2);
		pTable2.setFillsViewportHeight(true);
		pane_p3 = new JScrollPane(pTable3);
		pTable3.setFillsViewportHeight(true);
		pane_c1 = new JScrollPane(cTable);
		cTable.setFillsViewportHeight(true);
		pane_c2 = new JScrollPane(cTable2);
		cTable2.setFillsViewportHeight(true);
		pane_c3 = new JScrollPane(cTable3);
		cTable3.setFillsViewportHeight(true);
		pane_m1 = new JScrollPane(mTable);
		mTable.setFillsViewportHeight(true);
		pane_m2 = new JScrollPane(mTable2);
		mTable2.setFillsViewportHeight(true);
		pane_m3 = new JScrollPane(mTable3);
		mTable3.setFillsViewportHeight(true);
		initPanels();
	}
	protected void initTables()
	{
		bTable = new JTable(bNModel);
		bTable2 = new JTable(bFModel);
		bTable3 = new JTable(bTModel);
		pTable = new JTable(pNModel);
		pTable2 = new JTable(pFModel);
		pTable3 = new JTable(pTModel);
		cTable = new JTable(cNModel);
		cTable2 = new JTable(cFModel);
		cTable3 = new JTable(cTModel);
		mTable = new JTable(mNModel);
		mTable2 = new JTable(mFModel);
		mTable3 = new JTable(mTModel);
		tables = new ArrayList<JTable>(java.util.Arrays.asList(new JTable[]{bTable,bTable2,bTable3,pTable,pTable2,pTable3,cTable,cTable2,cTable3,mTable,mTable2,mTable3}));
		initScrollPanes();
	}
	protected void initTabs()//call last
	{
		tabs = new JTabbedPane();
		bTabs = new JTabbedPane();
		pTabs = new JTabbedPane();
		cTabs = new JTabbedPane();
		mTabs = new JTabbedPane();
		bTabs.addTab("Notes",bNotes);
		bTabs.addTab("Formulas",bFormulas);
		bTabs.addTab("Terms",bTerms);
		bTabs.addTab("Interactive",bInteractive);
		bTabs.addTab("Quiz",bQuiz);
		pTabs.addTab("Notes",pNotes);
		pTabs.addTab("Formulas",pFormulas);
		pTabs.addTab("Terms",pTerms);
		pTabs.addTab("Interactive",pInteractive);
		pTabs.addTab("Quiz",pQuiz);
		cTabs.addTab("Notes",cNotes);
		cTabs.addTab("Formulas",cFormulas);
		cTabs.addTab("Terms",cTerms);
		cTabs.addTab("Interactive",cInteractive);
		cTabs.addTab("Quiz",cQuiz);
		mTabs.addTab("Notes",mNotes);
		mTabs.addTab("Formulas",mFormulas);
		mTabs.addTab("Terms",mTerms);
		mTabs.addTab("Interactive",mInteractive);
		mTabs.addTab("Quiz",mQuiz);
		tabs.addTab("Biology",bTabs);
		tabs.addTab("Physics",pTabs);
		tabs.addTab("Chemistry",cTabs);
		tabs.addTab("Mathematics",mTabs);
		tabs.addTab("Quiz",quiz);
	} 
	protected void initTextAreas()
	{
		bio_n = new JTextArea();
		bio_f = new JTextArea();
		bio_t = new JTextArea();
		physics_n = new JTextArea();
		physics_f = new JTextArea();
		physics_t = new JTextArea();
		chem_n = new JTextArea();
		chem_f = new JTextArea();
		chem_t = new JTextArea();
		math_n = new JTextArea();
		math_f = new JTextArea();
		math_t = new JTextArea();
		bio_n.setEditable(false);
		bio_f.setEditable(false);
		bio_t.setEditable(false);
		physics_n.setEditable(false);
		physics_f.setEditable(false);
		physics_t.setEditable(false);
		chem_n.setEditable(false);
		chem_f.setEditable(false);
		chem_t.setEditable(false);
		math_n.setEditable(false);
		math_f.setEditable(false);
		math_t.setEditable(false);
	}
	protected void addSubjects(String[] subjects)
	{
		for(String s:subjects)
			addSubject(s);
	}
	protected void initNewPanel(JPanel s)
	{
		s.add(initNewModel(),BorderLayout.WEST);
		s.add(initNewTextArea(),BorderLayout.CENTER);
	}
	protected JScrollPane initNewScrollPane(JTable s)
	{
		JScrollPane t = new JScrollPane(s);
		s.setFillsViewportHeight(true);
		return t;
	}
	protected JScrollPane initNewModel()
	{
		return initNewTable(new DefaultTableModel());
	}
	protected JScrollPane initNewTable(DefaultTableModel s)
	{
		JTable t = new JTable(s);
		tables.add(t);
		return initNewScrollPane(t);
	}
	protected JTextArea initNewTextArea()
	{
		JTextArea t = new JTextArea();
		t.setEditable(false);
		return t;
	}
	protected void addSubject(String subject)
	{
		JTabbedPane temp = new JTabbedPane();
		temp.addTab("Notes",new JPanel(new BorderLayout()));
		temp.addTab("Formulas",new JPanel(new BorderLayout()));
		temp.addTab("Terms",new JPanel(new BorderLayout()));
		temp.addTab("Interactive",new JPanel(new BorderLayout()));
		temp.addTab("Quiz",new JPanel(new BorderLayout()));
		initNewPanel((JPanel)temp.getTabComponentAt(0));
		initNewPanel((JPanel)temp.getTabComponentAt(1));
		initNewPanel((JPanel)temp.getTabComponentAt(2));
		tabs.insertTab(subject,null,temp,null,tabs.getTabCount()-1);
	}
	protected void addNotes(String subject, String[] topics)
	{
		for(String s:topics)
			addNote(subject,s);
	}
//	protected void addFormulas(String subject, String[] formulas)
//	{
//		for(String s:formulas)
//			addFormula(subject,s);
//	}
//	protected void addTerms(String subject, String[] terms)
//	{
//		for(String s:terms)
//			addTerm(subject,s);
//	}
	protected void addNote(String subject,String topic)
	{
		System.out.println("Entered method");
		int x = 0;
		DefaultTableModel TEMP;
		for(;x<tabs.getTabCount()-1;x++)
		{
			System.out.println("Inside loop");
			if(tabs.getTitleAt(x).equalsIgnoreCase(subject))
			{
				System.out.println("Found tab");
				TEMP = (DefaultTableModel)(tables.get(x*3).getModel());
				TEMP.addRow(new Object[]{topic});
				tables.get(x*3).setModel(TEMP);
				System.out.println("Added row");
				return;
			}
		}
		System.out.println("Did not find subject");
		addSubject("subject");
		System.out.println("Added subject");
		TEMP = (DefaultTableModel)(tables.get(x*3).getModel());
		TEMP.addRow(new Object[]{topic});
		tables.get(x*3).setModel(TEMP);
		System.out.println("Added row");
	}
//	protected void addNote(String subject,String topic)
//	{
//		for(int x=0;x<tabs.getTabCount();x++)
//		{
//			if(tabs.getTitleAt(x).equalsIgnoreCase(subject))
//			{
//				add_Note(x,topic);
//				return;
//			}
//		}
//		add_Note(addSubject("subject"),topic);
//	}
//	private native void add_Note(int pos,String topic);
//	private native void add_Formula(int pos,String topic);
//	private native void add_Term(int pos,String topic);
//	protected void addFormula(String subject,String topic)
//	{
//		for(int x=0;x<tabs.getTabCount();x++)
//		{
//			if(tabs.getTitleAt(x).equalsIgnoreCase(subject))
//			{
//				add_Formula(x,topic);
//				return;
//			}
//		}
//		add_Formula(addSubject("subject"),topic);
//	}
//	protected void addTerm(String subject,String topic)
//	{
//		for(int x=0;x<tabs.getTabCount();x++)
//		{
//			if(tabs.getTitleAt(x).equalsIgnoreCase(subject))
//			{
//				add_Term(x,topic);
//				return;
//			}
//		}
//		add_Term(addSubject("subject"),topic);
//	}
	public static void main(String[] args)
	{
		new GUIProject();
	}
}