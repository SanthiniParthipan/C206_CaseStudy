
public class BikeParts {
	private String partName;
	private String descriptions;
	private boolean isAvailable;
	
	public BikeParts(String partName, String descriptions, boolean isAvailable) {
	    super();
	    this.partName = partName;
	    this.descriptions = descriptions;
	    this.isAvailable = isAvailable;
	  }

	public String getPartName() {
		return partName;
		
	}
	
	public void setPartName(String partName) {
		this.partName = partName;
	}
	
	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	  public String toString() {
		    String output = "";
		    return output += "PARTNAME: " + partName + " " + "DESCRIPTIONS: " + descriptions;
	}

}

