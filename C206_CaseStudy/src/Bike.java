 //gabrielle
public class Bike {
	//Gabrielle 
	private String model; 
	private String description;
	private boolean isAvailable;
	private int stock;
	
  
	
	public Bike(String model, String description, boolean isAvailable, int stock) {
		 
		this.model = model;
		this.description = description;
		this.isAvailable = isAvailable;
		this.stock = stock;
		
	}

	public Bike(String string, String string2, boolean b) {
		// TODO Auto-generated constructor stub
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
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String toString() {
		    String output = "";
		    return output += "MODEL: " + model + " " + "DESCRIPTIONS: " + description + "AVAILABLITY: " + isAvailable;
	}
	
	public boolean equalsIgnoreCase(String n) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toStrings() {
		return String.format("%-30s %-10d %-10s",getModel(),getStock(),showAvailabitlity(getIsAvailable()));
	}
	 
	private Object showAvailabitlity(boolean isAvailable) {
		String available;
		
		if(isAvailable == true && stock >= 1) {
			available = "Yes";
		}
		else {
			available = "No";
		}
		return available;
	}
	
	public static boolean calculateStock(int stock) {
			boolean isAvailable;
			
			if(stock >= 1) {
				isAvailable = true;
			}else { 
				isAvailable = false;
			}
			return isAvailable;
		}
	
	
	
	

}
