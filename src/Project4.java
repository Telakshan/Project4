import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;



public class Project4 {

	
	static fileMenuGUI g;
	static DateGUI gui;
static	UnsortedDateList unsort = new UnsortedDateList();
/*
 * The program will sort the dates using TreeMap instead of insert method
 * I removed sortedDateList class because there was no use for it in this project
 */
static TreeMap<Date212, Integer> tmap = new TreeMap(new Date212Comparator());
	/*Before you run, please change the directory in filemenuhandler (if necessary)
	 * main class has the readFile method which reads the file and adds unsorted and sorted lists.
	 * This class has a boolean method which checks if the numbers passes is valid
	 *
	 */
	public static void main(String[] args){
	
		g = new fileMenuGUI();
	}
	/*This method is called when the file is selected using the filemenuhandler class
	 */
		public static void readFile(String filename) throws FileNotFoundException {
			String delimiter = "\n\r\t,.;";
			File file = new File(filename);
			Scanner scan = new Scanner(file);
		 
			
			
				while(scan.hasNextLine()){
					try{
					String line = scan.nextLine();
					StringTokenizer token = new StringTokenizer(line,delimiter );
					
					while(token.hasMoreTokens()){
						String date = token.nextToken();
						Date212 Date = null;

						if(bool(date)){
							Date = new Date212(date);
							unsort.add(Date);//add unsorted and sorted
							tmap.put(Date, new Integer(1)); //add dates to treemap. it will automatically sort it
						}
					
					}
					
					
				}
				
			
		 catch(IllegalDate212Exception ide){
			System.out.println("Invalid Date: " + ide ); //catches any invalid date212 objects
	
		 }
		}
			scan.close();
			gui = new DateGUI(); //launches dategui
			
			

			}
			

	

	 public static boolean bool (String x){
	    
	     boolean bool = true; //check if date is valid
	     String baseCase = "0123456789";
	     
	     
	     for(int i = 0; i <x.length(); i++){  
	    	
	    	 if(baseCase.indexOf(x.charAt(i))!=-1){//checks to see that number is positive and doesnt contain any letter using indexof and charAt
	    		
	    		 bool = bool & true;  //bool is true if it doesn't
	    	 }
	    	 else{
	    	 
	    		 bool = bool & false; // or else false
	    	 }
	     }
	    	 if(x.length()!=8){  //if statement that checks if the string equals 8 chars
	    		
	    		 bool = bool & false; 
	    	 }
	    	 else bool = bool & true; 
	     
	     return bool; 
	 }
}
class Date212Comparator implements Comparator<Date212>{

		@Override
		public int compare(Date212 date1, Date212 date2) {
			// TODO Auto-generated method stub
			return date1.compareTo(date2);
		}
		
	}
	


