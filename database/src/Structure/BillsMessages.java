package Structure;


import java.util.Date;

public class BillsMessages {
	private int id;
	private int user_id;
	private int bill_id;
	private Date msg_time;
	private double price;
	private Date schedule_start;
	private Date schedul_eend;
	private String note;


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

	public int getBillid() {
		return bill_id;
	}

	public void setBillid(int billid) {
		this.bill_id = billid;
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
		return schedul_eend;
	}

	public void setScheduleend(Date scheduleend) {
		this.schedul_eend = scheduleend;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @param id
	 * @param userid
	 * @param billid
	 * @param msgtime
	 * @param price
	 * @param schedulestart
	 * @param scheduleend
	 * @param note
	 */
	public BillsMessages(int id, int userid, int billid, Date msgtime, double price, Date schedulestart,
			Date scheduleend, String note) {
		super();
		this.id = id;
		this.user_id = userid;
		this.bill_id = billid;
		this.msg_time = msgtime;
		this.price = price;
		this.schedule_start = schedulestart;
		this.schedul_eend = scheduleend;
		this.note = note;
	}

	/**
	 * 
	 */
	public BillsMessages() {
		super();
		// TODO Auto-generated constructor stub
	}

}