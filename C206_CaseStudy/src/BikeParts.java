 
public class BikeParts { 
	// Jia Xin
	private String ID;
	private String partName;
	private int unit;
	private String descriptions;
	private boolean isAvailable;
	
	public BikeParts(String ID, String partName, int unit,String descriptions, boolean isAvailable) {
	    super();
	    this.ID = ID;
	    this.partName = partName;
	    this.unit = unit;
	    this.descriptions = descriptions;
	    this.isAvailable = isAvailable;
	  }
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPartName() {
		return partName;
		
	}
	
	public void setPartName(String partName) {
		this.partName = partName;
	}
	
	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	  public String toString() {
		    String output = "";
		    return output += "PARTNAME: " + partName + " " + "DESCRIPTIONS: " + descriptions;
	}

	public boolean equalsIgnoreCase(String n) {
		// TODO Auto-generated method stub
		return false;
	}
	 
	public String toStrings() {
		return String.format("%-10s %-30s %-10d %-10s",getID(),getPartName(),getUnit(),showAvailabitlity(getIsAvailable()));
	}

	private Object showAvailabitlity(boolean isAvailable) {
		String available;
		
		if(isAvailable == true && unit >= 1) {
			available = "Yes";
		}
		else {
			available = "No";
		}
		return available;
	}
	
	public static boolean calculate(int unit) {
		boolean isAvailable;
		
		if(unit >= 1) {
			isAvailable = true;
		}else { 
			isAvailable = false;
		}
		return isAvailable;
	}
}



