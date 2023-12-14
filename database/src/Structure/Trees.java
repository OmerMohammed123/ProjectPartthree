package Structure;


public class Trees {
	private int id;
	private int quoteid;
	private double size;
	private double height;
	private double distance;

	// Constructors
	public Trees() {
	}

	public Trees(int id, int quoteid, double size, double height, double distanceFromHouse) {
		this.id = id;
		this.quoteid = quoteid;
		this.size = size;
		this.height = height;
		this.distance = distanceFromHouse;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuoteid() {
		return quoteid;
	}

	public void setQuoteid(int quoteid) {
		this.quoteid = quoteid;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDistanceFromHouse() {
		return distance;
	}

	public void setDistanceFromHouse(double distanceFromHouse) {
		this.distance = distanceFromHouse;
	}
}