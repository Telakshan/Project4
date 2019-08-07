public abstract class DateList {
    protected  DateNode first;
    protected  DateNode last;
    protected DateNode temp;
    
    /*
     * Abstract class datelist
     * first node in list is a dummy node
     */
    public DateList() {
        DateNode ln = new DateNode(null);
        first = ln;
        last = ln;
    }
    
    /*
     * every class that inherits datelist will have this method
     */
    public abstract void add(Date212 date); 
    



}
