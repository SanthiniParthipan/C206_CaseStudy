   
public class Appointment {
  private String name;
	private int number;
	private String ic; 
	private String date;
	
	public Appointment(String name, int number, String ic, String date) {
		super();
		this.name = name;
		this.number = number;
		this.ic = ic;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String toString() {
		return String.format("%-20s %-20d %-20s %-20s", getName(), getNumber(), getIc(), getDate());
	}
}
