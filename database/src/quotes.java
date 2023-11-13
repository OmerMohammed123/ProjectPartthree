public class quotes {
    private int quoteID;
    private String initialprice;
    private String note;
    private String timeWindow;
    
    public quotes() {
        // Default constructor
    }

    public quotes(int quoteID, String initialprice, String note, String timeWindow) {
        this.quoteID = quoteID;
        this.initialprice = initialprice;
        this.note = note;
        this.timeWindow = timeWindow;
    }
    
    public quotes(String initialprice, String note, String timeWindow) {
        this.initialprice = initialprice;
        this.note = note;
        this.timeWindow = timeWindow;
    }

	public int getQuoteID() {
        return quoteID;
    }

    public void setQuoteID(int quoteID) {
        this.quoteID = quoteID;
    }
    
    public String getInitialprice() {
        return initialprice;
    }
    
    public void setInitialprice(String initialprice) {
        this.initialprice = initialprice;
    }
    public String getNote() {
        return note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public String getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(String timeWindow) {
        this.timeWindow = timeWindow;
    }
    

}