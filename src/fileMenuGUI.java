

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class fileMenuGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * I made a new class rather than add it to the dategui because it 
	 * was not easy to work with for me
	 */
	public fileMenuGUI(){
		setTitle("File Menu");
		//frame.setLayout(new GridLayout(1,1));
		setSize(500, 300);
		setLocation(400, 200);
		createFileMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void createFileMenu(){
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem item;
		FileMenuHandler fmh = new FileMenuHandler(this);
		item = new JMenuItem("Open");
		item.addActionListener(fmh);
		fileMenu.add(item);
		fileMenu.addSeparator();
		item = new JMenuItem("Quit");
		item.addActionListener(fmh);
		fileMenu.add(item);
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);

	}
	
	

}
