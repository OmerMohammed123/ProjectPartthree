package Structure;

import java.util.Date;

public class Quotes {
	private int id;
	private int contractor_id;
	private int client_id;
	private double price;
	private Date schedule_start;
	private Date schedule_end;
	
	private String timeWindow;
	private String note;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContractorid() {
		return contractor_id;
	}

	public void setContractorid(int contractorid) {
		this.contractor_id = contractorid;
	}

	public String getTimeWindow() {
		return timeWindow;
	}

	public void setTimeWindow(String timeWindow) {
		this.timeWindow = timeWindow;
	}

	public String getMote() {
		return note;
	}

	public void setMote(String mote) {
		this.note = mote;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getClientid() {
		return client_id;
	}

	public void setClientid(int clientid) {
		this.client_id = clientid;
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

	/**
	 * 
	 */
	public Quotes() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param contractorid
	 * @param clientid
	 * @param price
	 * @param schedulestart
	 * @param scheduleend
	 */
	public Quotes(int id, int contractorid, int clientid, double price, Date schedulestart, Date scheduleend) {
		super();
		this.id = id;
		this.contractor_id = contractorid;
		this.client_id = clientid;
		this.price = price;
		this.schedule_start = schedulestart;
		this.schedule_end = scheduleend;
	}

	public Date getScheduleend() {
		return schedule_end;
	}

	public void setScheduleend(Date scheduleend) {
		this.schedule_end = scheduleend;
	}

	// Getters and setters

}