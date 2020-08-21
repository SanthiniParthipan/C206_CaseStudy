
public class Bike {
	
	private String model;
	private String description;
	private boolean isAvailable;
	

	
	public Bike(String model, String description, boolean isAvailable) {
		 
		this.model = model;
		this.description = description;
		this.isAvailable = isAvailable;
	}

	public String getModel() {
		return model;
		
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescriptions(String description) {
		this.description = description;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	  public String toString() {
		    String output = "";
		    return output += "MODEL: " + model + " " + "DESCRIPTIONS: " + description + "AVAILABLITY: " + isAvailable;
	}


}
