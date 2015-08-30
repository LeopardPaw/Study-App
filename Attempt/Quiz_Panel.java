package gui_project;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Quiz_Panel extends JSplitPane
{
	private final JTextArea question;
	private final JPanel questionHolder,answers;
	private final String subject;
//	private final ArrayList;
	private final File[][] frqAndMcq;
	public Quiz_Panel(String t)
	{
		super(JSplitPane.VERTICAL_SPLIT,true);
		subject = t;
		File temp = new File("quiz"+File.separator+"frq"+File.separator+subject+File.separator);
		frqAndMcq = new File[2][];
		frqAndMcq[0] = temp.listFiles();
		temp = new File("quiz"+File.separator+"mcq"+File.separator+subject+File.separator);
		frqAndMcq[1] = temp.listFiles();
		questionHolder = new JPanel(new BorderLayout());
		question = new JTextArea();
		answers = new JPanel();
		questionHolder.add(question,BorderLayout.CENTER);
		setLeftComponent(questionHolder);
		setRightComponent(answers);
		setVisible(true);
		getQuestion();
	}
	protected void getQuestion()
	{
		BufferedReader reader = null;
		try
		{
			switch((int)(Math.random()*2))
			{
				case(0): reader = new BufferedReader(new FileReader(frqAndMcq[0][(int)(Math.random()*frqAndMcq[0].length)])); break;
				case(1): reader = new BufferedReader(new FileReader(frqAndMcq[1][(int)(Math.random()*frqAndMcq[1].length)])); break;
			}
			String i;
			while((i = reader.readLine()) != null)
				question.append(i+"\n");
		}
		catch(IOException e){}
	}
}