package Structure;

import java.util.Date;

public class Quotes_Messages {
	private int id;
	private int user_id;
	private int quote_id;
	private Date msg_time;
	private double price;
	private Date schedule_start;
	private Date schedule_end;
	private String note;

	// Constructors
	public Quotes_Messages() {
	}

	public Quotes_Messages(int id, int userid, int quoteid, Date msgtime, double price, Date schedulestart,
			Date scheduleend, String note) {
		this.id = id;
		this.user_id = userid;
		this.quote_id = quoteid;
		this.msg_time = msgtime;
		this.price = price;
		this.schedule_start = schedulestart;
		this.schedule_end = scheduleend;
		this.note = note;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return user_id;
	}

	public void setUserid(int userid) {
		this.user_id = userid;
	}

	public int getQuoteid() {
		return quote_id;
	}

	public void setQuoteid(int quoteid) {
		this.quote_id = quoteid;
	}

	public Date getMsgtime() {
		return msg_time;
	}

	public void setMsgtime(Date msgtime) {
		this.msg_time = msgtime;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}