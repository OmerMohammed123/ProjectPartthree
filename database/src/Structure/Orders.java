package Structure;


import java.util.Date;

public class Orders {
	private int id;
	private int quote_id;
	private double price;
	private Date schedule_start;
	private Date schedule_end;
            private Date schedule_End; // Add this line

	// Constructors
	public Orders() {
	}

	public Orders(int id, int quoteid, double price, Date schedulestart, Date scheduleend) {
		this.id = id;
		this.quote_id = quoteid;
		this.price = price;
		this.schedule_start = schedulestart;
		this.schedule_end = scheduleend;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuoteid() {
		return quote_id;
	}

	public void setQuoteid(int quoteid) {
		this.quote_id = quoteid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getSchedulestart() {
		return schedule_start;
	}

	public void setSchedulestart(Date schedulestart) {
		this.schedule_start = schedulestart;
	}

	public Date getScheduleend() {
		return schedule_end;
	}

	public void setScheduleend(Date scheduleend) {
		this.schedule_end = scheduleend;
	}
}