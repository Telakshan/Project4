import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileMenuHandler implements ActionListener {
	JFrame jframe;
	public FileMenuHandler (JFrame jf){ //jframe for filemenuhandler
		jframe = jf;
	}
	/*actionPerformed takes in commands and executes
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String menuName = event.getActionCommand();
		JButton open = new JButton();
		if(menuName.equals("Open")){ //Opens filechooser if commanded
			JFileChooser fc = new JFileChooser(); 
			fc.setCurrentDirectory(new java.io.File("C:/Users"));
			fc.setDialogTitle("Choose the File");
			
			fc.setFileSelectionMode(JFileChooser.FILES_ONLY); //selecting the file
			if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){
			
			}
			File f = fc.getSelectedFile(); //gets the file
			System.out.println("You chose: " + fc.getSelectedFile().getAbsolutePath());
			
			if(f!=null){
			try {
					Project4.readFile(f.getAbsolutePath());; //read the file using method in project3
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
				}

			

		}
		}
		else  if (menuName.equals("Quit"))  //Quit 
			System.exit(0);			
		}
	
	
	}


