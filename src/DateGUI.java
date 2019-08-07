
import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DateGUI extends JFrame{
	
	/*
	 * Launches the DateGUI 
	 * I used functions setSorted and setUnsorted to add the lists to the text area
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static TextArea unsortedTA;
	static TextArea sortedTA;
	public  DateGUI(){
		
		
		JFrame myFrame = new JFrame();
		myFrame.setLayout(new GridLayout(1,1));
		myFrame.setTitle("Project 4");
		myFrame.setSize(400, 300);
		myFrame.setLocation(400,200);
		myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(1,1));
		myFrame.add(myPanel);
		setUnsorted(Project4.unsort);
		myPanel.add(unsortedTA);
		setTmap(Project4.tmap);
		myPanel.add(sortedTA);
		myFrame.pack();
		myFrame.setVisible(true);
		
	
	}
	
	
	public static void setUnsorted(UnsortedDateList n){
		String dates = "";
		ArrayList<String> list = n.returninBulk();
		
		for(int i=0; i<list.size(); i++){ 
			dates += list.get(i) + "\n";
		}
		DateGUI.unsortedTA = new TextArea(dates);
		DateGUI.unsortedTA.setEditable(false);
	}
	
	
	
	public static void setTmap(TreeMap n){
		
	String dates = "";
for(java.util.Map.Entry<Date212, Integer> entry : Project4.tmap.entrySet()){
			
			Date212 key = entry.getKey();
			dates += key.forGUI() +"\n";
}

	DateGUI.sortedTA = new TextArea(dates);
	DateGUI.sortedTA.setEditable(false);

	}
		
	
	}
	
	
	

