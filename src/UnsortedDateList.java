import java.util.ArrayList;

public class UnsortedDateList extends DateList{
	/*This inherits methods and variables from Datelist superclass
	 * (non-Javadoc)
	 * @see DateList#add(Date212)
	 */
	public void add(Date212 date){
		
		DateNode n = new DateNode(date);
		
		last.next = n;
		last = n;
		//System.out.println("Unsorted" + returninBulk());
	 
	}
	/*returns the list in string array list form
	 * returns it in bulk
	 */
	public  ArrayList<String> returninBulk() {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String> ();
		DateNode temp1;
		temp1 = first;
		
		while(temp1.next!=null){
			temp1 = temp1.next;
			
			list.add(temp1.data.forGUI());
			
		}
		temp1 = first;
		return list;
		
	}
	
	

	
		
		
		
	}
	


